package io.github.fgabrielbraga.exerciciossb.controller;

import io.github.fgabrielbraga.exerciciossb.model.entities.Product;
import io.github.fgabrielbraga.exerciciossb.model.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

//    @PostMapping
//    public @ResponseBody Product newProduto(@Valid Product product) {
//        productRepository.save(product);
//        return product;
//    }
//
//    @PutMapping
//    public Product alterProduct(@Valid Product product) {
//        productRepository.save(product);
//        return product;
//    }

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public Product saveProduct(@Valid Product product) {
        productRepository.save(product);
        return product;
    }

    @GetMapping
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/page/{numberPage}/{quantityPages}")
    public Iterable<Product> getProductsByPage(@PathVariable int numberPage, @PathVariable int quantityPages) {
        quantityPages = quantityPages >= 5 ? 5 : quantityPages;
        Pageable page = PageRequest.of(numberPage, quantityPages);
        return productRepository.findAll(page);
    }

    @GetMapping("/name/{name}")
    public Iterable<Product> getProductsByNome(@PathVariable String name) {
        //return productRepository.findByNameContainingIgnoreCase(name);
        return productRepository.searchByNameLike(name);
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable int id) {
        return productRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        productRepository.deleteById(id);
    }
}
