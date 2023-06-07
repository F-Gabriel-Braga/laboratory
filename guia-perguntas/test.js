const express = require("express");
const app = express();

app.set('view engine', 'ejs');
app.use(express.static("public"));

app.get("/:nome/:linguagem/:exibir", (req, res) => {
    let nome = req.params.nome;
    let linguagem = req.params.linguagem;
    let exibir = req.params.exibir == "true" ? true : false;

    let produtos = [
        { nome: "Doritos", preco: 3.14 },
        { nome: "Coca Cola", preco: 5.2 },
        { nome: "Leite", preco: 7.0 },
        { nome: "Pão", preco: 12.0 },
        { nome: "Arroz", preco: 3.49 },
    ]

    res.render("test", { nome, linguagem, exibir, produtos });
})

const port = 3000;
app.listen(port, () => {
    console.log("SERVIDOR EXECUTANDO NA PORTA " + port);
});