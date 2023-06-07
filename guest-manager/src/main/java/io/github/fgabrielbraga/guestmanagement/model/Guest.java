package io.github.fgabrielbraga.guestmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer amountCompanions;

    public Guest() {

    }

    public Guest(String name, Integer amountCompanions) {
        setName(name);
        setAmountCompanions(amountCompanions);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmountCompanions() {
        return amountCompanions;
    }

    public void setAmountCompanions(Integer amountCompanions) {
        this.amountCompanions = amountCompanions;
    }
}
