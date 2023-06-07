package io.github.fgabrielbraga.vendas.services;

import io.github.fgabrielbraga.vendas.models.Cliente;
import io.github.fgabrielbraga.vendas.models.dto.ClienteDTO;
import io.github.fgabrielbraga.vendas.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteDTO save(ClienteDTO dto) {
        Cliente cliente = ClienteDTO.convert(dto);
        cliente = this.clienteRepository.save(cliente);
        return new ClienteDTO((cliente));
    }

    public List<ClienteDTO> findAll() {
        List<Cliente> clientes = this.clienteRepository.findAll();
        List<ClienteDTO> clientesDTO = clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
        return clientesDTO;
    }

    public ClienteDTO findById(Long id) {
        Optional<Cliente> cliente = this.clienteRepository.findById(id);
        if(cliente.isEmpty()) {
            throw new RuntimeException("O cliente não foi encontrado!");
        }
        else {
            return new ClienteDTO(cliente.get());
        }
    }

    public ClienteDTO deleteById(Long id) {
        ClienteDTO dto = this.findById(id);
        this.clienteRepository.deleteById(id);
        return dto;
    }

    public ClienteDTO updateById(Long id, ClienteDTO dto) {
        this.findById(id);
        Cliente cliente = ClienteDTO.convert(dto);
        cliente.setId(id);
        cliente = this.clienteRepository.save(cliente);
        return new ClienteDTO(cliente);
    }
}
