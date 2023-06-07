package io.github.fgabrielbraga.eventosapp.controllers;

import io.github.fgabrielbraga.eventosapp.models.Convidado;
import io.github.fgabrielbraga.eventosapp.models.Evento;
import io.github.fgabrielbraga.eventosapp.repositories.ConvidadoRepository;
import io.github.fgabrielbraga.eventosapp.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private ConvidadoRepository convidadoRepository;

    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping
    public ModelAndView listarEventos() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("eventos", eventoRepository.findAll());
        return modelAndView;
    }

    @GetMapping("/cadastrar")
    public String cadastrarEvento() {
        return "formEvento";
    }

    @GetMapping("/{id}")
    public ModelAndView detalharEvento(@PathVariable("id") Long id) {
        Evento evento = eventoRepository.findById(id).get();
        Iterable<Convidado> convidados = convidadoRepository.findByEvento(evento);
        ModelAndView modelAndView = new ModelAndView("detalhesEvento");
        modelAndView.addObject("evento", evento);
        modelAndView.addObject("convidados", convidados);
        return modelAndView;
    }

    @GetMapping("/deletar")
    public String deletarEvento(Long id) {
        Evento evento = eventoRepository.findById(id).get();
        eventoRepository.delete(evento);
        return "redirect:/eventos";
    }

    @PostMapping("/cadastrar")
    public String salvarEvento(@Valid Evento evento, BindingResult result, RedirectAttributes attributes) {
        if(result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique os campos!");
            return "redirect:/eventos/cadastrar";
        }
        eventoRepository.save(evento);
        attributes.addFlashAttribute("mensagem", "Evento cadastrado!");
        return "redirect:/eventos/cadastrar";
    }

    @PostMapping("/{id}")
    public String adicionarConvidado(@PathVariable Long id, @Valid Convidado convidado, BindingResult result, RedirectAttributes attributes) {
        if(result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique os campos!");
            return "redirect:/eventos/{id}";
        }
        Evento evento = eventoRepository.findById(id).get();
        convidado.setEvento(evento);
        convidadoRepository.save(convidado);
        attributes.addFlashAttribute("mensagem", "Convidado adicionado!");
        return "redirect:/eventos/{id}";
    }

    @GetMapping("/convidado/deletar")
    public String deletarConvidado(String cpf) {
        Convidado convidado = convidadoRepository.findByCpf(cpf);
        Evento evento = convidado.getEvento();
        convidadoRepository.delete(convidado);
        Long id = evento.getId();
        return String.format("redirect:/eventos/%d", id);
    }
}
