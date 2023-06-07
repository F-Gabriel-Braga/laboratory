const Sequelize = require("sequelize");

const connection = new Sequelize('blog', 'root', 'root3306', {
    host: 'localhost',
    dialect: 'mysql'
});

module.exports = connection;