const express = require("express");
const app = express();
const bodyParser = require("body-parser");
const connection = require('./database/database');
const Pergunta = require('./database/Pergunta');
const Resposta = require('./database/Resposta');

// database
connection.authenticate().then(() => {
    console.log("Aplicação conectada com banco de dados.")
}).catch(error => {
    console.error("Erro ao conectar aplicação com banco de dados", error);
})

app.set('view engine', 'ejs');
app.use(express.static("public"));

// body parser
app.use(bodyParser.urlencoded({extended: false}));
app.use(bodyParser.json());


// rotas
app.get("/", (req, res) => {
    Pergunta.findAll({ raw: true, order: [
        ['id', 'DESC'] // ASC = Crescente, DESC = Decrescente
    ] }).then(perguntas => {
        res.render("index", { perguntas });
    }).catch(error => {
        res.send("Erro ao buscar perguntas.");
        console.error(error);
    });
})

app.get("/question/new", (req, res) => {
    res.render("new-question");
})

app.post("/question/new", (req, res) => {
    const title = req.body.title;
    const question = req.body.question;
    Pergunta.create({
        titulo: title,
        descricao: question
    }).then(() => {
        res.redirect("/")
    }).catch(error => {
        res.send("Erro ao cadastrar pergunta.");
        console.error(error);
    });
});

app.get("/question/:id", (req, res) => {
    const id = req.params.id;
    Pergunta.findOne({
        where: { id }
    }).then(pergunta => {
        if(pergunta != undefined) {
            Resposta.findAll({
                raw: true,
                where: { id_pergunta: id },
                order: [["id", "DESC"]]
            }).then(respostas => {
                res.render("question", { pergunta, respostas })
            })
        }
        else {
            res.redirect("/");
        }
    }).catch(error => {
        res.send("Erro ao buscar pergunta.");
        console.error(error);
    });
});

app.post("/response", (req, res) => {
    const id_pergunta = req.body.id_question;
    const conteudo = req.body.content;
    Resposta.create({ conteudo, id_pergunta }).then(() => {
        res.redirect(`/question/${id_pergunta}`);
    }).catch(error => {
        res.send("Erro ao responder pergunta.");
        console.error(error);
    })
})

const port = 3000;
app.listen(port, () => {
    console.log("Servidor executando na porta", port);
});