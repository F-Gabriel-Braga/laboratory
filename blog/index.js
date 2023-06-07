const express = require('express');
const bodyParser = require('body-parser');
const connection = require('./database/database');
const categoriesController =  require('./categories/CategoryController');
const articlesController =  require('./articles/ArticleController');

const Article = require('./articles/Article');
const Category = require('./categories/Category');

const app = express();
const port = 3000;

// body parser
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

// routes
app.use("/", categoriesController);
app.use("/", articlesController);

// view engine
app.set('view engine', 'ejs');

// static
app.use(express.static('public'))

// database
connection.authenticate()
    .then(() => {
        console.log("Aplicação conectada com banco de dados");
    })
    .catch(error => {
        console.error("Erro ao conectar com banco de dados:", error);
    })

app.get("/", (req, res) => {
    res.render("index")
})

app.listen(port, () => {
    console.log("Aplicação executando na porta", port);
})