package com.gestionLocation.g04.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
public class Voiture {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idvoiture;
    private Long matriculevoiture;
    private String nomvoiture;
    private String couleur;
    private String marqueV;
    private Double prix;
//    private String imageUrl = "https://gomechanic.in/blog/wp-content/uploads/2023/05/tesla-roadster.webp";

    @Override
    public String toString() {
        return "Voiture{" +
                "idvoiture=" + idvoiture +
                ", matriculevoiture=" + matriculevoiture +
                ", nomvoiture='" + nomvoiture + '\'' +
                ", couleur='" + couleur + '\'' +
                ", marqueV='" + marqueV + '\'' +
                ", prix=" + prix +
                '}';
    }

    public Voiture(Long matriculevoiture, String nomvoiture, String couleur, String marqueV, Double prix) {
        this.matriculevoiture = matriculevoiture;
        this.nomvoiture = nomvoiture;
        this.couleur = couleur;
        this.marqueV = marqueV;
        this.prix = prix;
    }
    public Voiture() {
        super();
    }
    public Long getIdvoiture() {
        return idvoiture;
    }

    public void setIdvoiture(Long idvoiture) {
        this.idvoiture = idvoiture;
    }

    public Long getMatriculevoiture() {
        return matriculevoiture;
    }

    public void setMatriculevoiture(Long matriculevoiture) {
        this.matriculevoiture = matriculevoiture;
    }

    public String getNomvoiture() {
        return nomvoiture;
    }

    public void setNomvoiture(String nomvoiture) {
        this.nomvoiture = nomvoiture;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getMarqueV() {
        return marqueV;
    }

    public void setMarqueV(String marqueV) {
        this.marqueV = marqueV;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
