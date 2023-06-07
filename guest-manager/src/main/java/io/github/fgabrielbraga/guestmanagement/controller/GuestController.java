package io.github.fgabrielbraga.guestmanagement.controller;

import io.github.fgabrielbraga.guestmanagement.model.Guest;
import io.github.fgabrielbraga.guestmanagement.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/guests")
public class GuestController {

    @Autowired
    private GuestRepository guestRepository;

    @GetMapping
    public ModelAndView listGuests() {
        ModelAndView modelAndView = new ModelAndView("guest-list");
        modelAndView.addObject(new Guest());
        modelAndView.addObject("guests", guestRepository.findAll());
        return modelAndView;
    }

    @PostMapping
    public String saveGuest(Guest guest) {
        this.guestRepository.save(guest);
        return "redirect:/guests";
    }
}
