const express = require('express');
const slugify = require('slugify');

const router = express.Router();
const Category = require('./Category');

router.get("/categories", (req, res) => {
    res.send("Categorias");
});

router.get("/admin/categories/new", (req, res) => {
    res.render('admin/categories/new')
});

router.post("/categories/save", (req, res) => {
    var title = req.body.title;
    if(title != undefined) {
        Category.create({ title, slug: slugify(title) })
        .then(() => {
            res.redirect("/admin/categories");
        });
    }
    else {
        res.redirect("/admin/categories/new");
    }
});

router.get("/admin/categories", (req, res) => {
    Category.findAll().then(categories => {
        res.render("admin/categories/index", { categories });
    }).catch(error => {
        res.redirect("/");
        console.error(error);
    });
});

module.exports = router;