package io.github.fgabrielbraga.vendas.controllers;

import io.github.fgabrielbraga.vendas.models.dto.VendaDTO;
import io.github.fgabrielbraga.vendas.services.VendaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @GetMapping("/vendas/cliente/{idCliente}")
    public List<VendaDTO> findAll(@PathVariable Long idCliente) {
        return this.vendaService.findByCliente(idCliente);
    }

    @GetMapping("/vendas/{id}")
    public VendaDTO findById(@PathVariable Long id) {
        return this.vendaService.findById(id);
    }

    @PostMapping("/vendas")
    public VendaDTO save(@RequestBody @Valid VendaDTO dto) {
        return this.vendaService.save(dto);
    }
}
