package io.github.fgabrielbraga.vendas.services;

import io.github.fgabrielbraga.vendas.models.Venda;
import io.github.fgabrielbraga.vendas.models.dto.VendaDTO;
import io.github.fgabrielbraga.vendas.repositories.ClienteRepository;
import io.github.fgabrielbraga.vendas.repositories.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    public List<VendaDTO> findByCliente(Long idCliente) {
        List<Venda> vendas = this.vendaRepository.findByCliente(idCliente);
        List<VendaDTO> vendasDTO = vendas.stream().map(VendaDTO::new).collect(Collectors.toList());
        return vendasDTO;
    }

    public VendaDTO findById(Long id) {
        Optional<Venda> venda = this.vendaRepository.findById(id);
        if(venda.isEmpty()) {
            throw new RuntimeException("A venda não foi encontrada!");
        }
        else {
            return new VendaDTO(venda.get());
        }
    }

    public VendaDTO save(VendaDTO dto) {
        Venda venda = VendaDTO.convert(dto);
        for(int i = 0; i < venda.getItems().size(); i++) {
            venda.getItems().get(i).setVenda(venda);
        }
        venda = this.vendaRepository.save(venda);
        return new VendaDTO(venda);
    }
}
