const { Sequelize } = require('sequelize');
const connection = require('./database');

const Resposta = connection.define('resposta', {
    conteudo: {
        type: Sequelize.TEXT,
        allowNull: false
    },
    id_pergunta: {
        type: Sequelize.INTEGER,
        allowNull: false
    }
})

Resposta.sync({ force: false }).then(() => {
    console.log("Tabela resposta, criada.")
}).catch(error => {
    console.error("Erro ao criar tabela resposta", error)
})

module.exports = Resposta;