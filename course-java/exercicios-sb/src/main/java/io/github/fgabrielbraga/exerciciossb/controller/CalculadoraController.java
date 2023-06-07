package io.github.fgabrielbraga.exerciciossb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/somar/{a}/{b}")
    public String somar(@PathVariable int a, @PathVariable int b) {
        return Integer.toString(a + b);
    }

    @GetMapping("/subtrair")
    public String subtrair(@RequestParam(name = "a") int a, @RequestParam int b) {
        return Integer.toString(a - b);
    }
}