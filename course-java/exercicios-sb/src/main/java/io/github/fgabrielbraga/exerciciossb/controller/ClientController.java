package io.github.fgabrielbraga.exerciciossb.controller;

import io.github.fgabrielbraga.exerciciossb.model.entities.Client;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {

    @GetMapping(path = "/thing")
    public Client getClient() {
        return new Client(20, "Estefane", "123.456.789-00");
    }

    @GetMapping(path = "/{id}")
    public Client getClientPorId1(@PathVariable int id) {
        return new Client(id, "Maria", "745.523.874-12");
    }

    @GetMapping
    public Client getClientPorId2(@RequestParam(name = "id") int id) {
        return new Client(id, "João Augusto", "236.741.852-45");
    }
}
