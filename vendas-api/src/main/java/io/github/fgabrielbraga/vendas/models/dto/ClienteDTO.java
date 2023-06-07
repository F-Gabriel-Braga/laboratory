package io.github.fgabrielbraga.vendas.models.dto;

import ch.qos.logback.core.net.server.Client;
import io.github.fgabrielbraga.vendas.models.Cliente;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public class ClienteDTO {

    private Long id;

    @NotBlank(message = "O nome do cliente é obrigatório")
    private String nome;

    @NotBlank(message = "O e-mail do cliente é obrigatório")
    @Email(message = "O e-mail do cliente está inválido")
    private String email;

    @NotBlank(message = "O CPF do cliente é obrigatório")
    @CPF(message = "O CPF do cliente está inválido")
    private String cpf;

    @NotBlank(message = "A data de nascimento do cliente é obrigatória")
    private String dataNascimento;

    @NotBlank(message = "O telefone do cliente é obrigatório")
    private String telefone;

    @NotBlank(message = "O logradouro do cliente é obrigatório")
    private String logradouro;

    @NotBlank(message = "O número do cliente é obrigatório")
    private String numero;

    @NotBlank(message = "A cidade do cliente é obrigatória")
    private String cidade;

    @NotBlank(message = "O estado do cliente é obrigatório")
    private String estado;

    public ClienteDTO() {
    }

    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.email = cliente.getEmail();
        this.cpf = cliente.getCpf();
        this.dataNascimento = cliente.getDataNascimento();
        this.telefone = cliente.getTelefone();
        this.logradouro = cliente.getLogradouro();
        this.numero = cliente.getNumero();
        this.cidade = cliente.getCidade();
        this.estado = cliente.getEstado();
    }

    public static Cliente convert(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setId(clienteDTO.getId());
        cliente.setNome(clienteDTO.getNome());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setCpf(clienteDTO.getCpf());
        cliente.setDataNascimento(clienteDTO.getDataNascimento());
        cliente.setTelefone(clienteDTO.getTelefone());
        cliente.setLogradouro(clienteDTO.getLogradouro());
        cliente.setNumero(clienteDTO.getNumero());
        cliente.setCidade(clienteDTO.getCidade());
        cliente.setEstado(clienteDTO.getEstado());
        return cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
