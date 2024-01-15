package com.gestionLocation.g04.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

import java.util.List;


@Entity
public class Marque {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long IdMarque;
    private String nom;
    private String paysOrigine;
    private int anneeFondation;

    public Marque(Long IdMarque, String nom, String paysOrigine, int anneeFondation) {
        this.IdMarque = IdMarque;
        this.nom = nom;
        this.paysOrigine = paysOrigine;
        this.anneeFondation = anneeFondation;

    }
    public Marque() {
        super();
    }

    public Long getIdMarque() {
        return IdMarque;
    }

    public void setIdMarque(Long idMarque) {
        IdMarque = idMarque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPaysOrigine() {
        return paysOrigine;
    }

    public void setPaysOrigine(String paysOrigine) {
        this.paysOrigine = paysOrigine;
    }

    public int getAnneeFondation() {
        return anneeFondation;
    }

    public void setAnneeFondation(int anneeFondation) {
        this.anneeFondation = anneeFondation;
    }
}
