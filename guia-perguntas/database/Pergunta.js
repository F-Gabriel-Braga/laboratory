const { Sequelize } = require('sequelize');
const connection = require('./database');

const Pergunta = connection.define('pergunta', {
    titulo: {
        type: Sequelize.STRING,
        allowNull: false
    },
    descricao: {
        type: Sequelize.TEXT,
        allowNull: null
    },
});

Pergunta.sync({ force: false }).then(() => {
    console.log("Tabela pergunta, criada.")
}).catch(error => {
    console.error("Erro ao criar tabela pergunta", error)
})

module.exports = Pergunta;