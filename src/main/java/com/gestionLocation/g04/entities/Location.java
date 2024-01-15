package com.gestionLocation.g04.entities;


import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
public class Location {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLocation;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    @Fetch(FetchMode.JOIN)
    Client client;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "voiture_id")
    @Fetch(FetchMode.JOIN)
    Voiture voiture;


    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datedebutres;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datefinres;
    public Location() {
        super();
    }

    public Location(Long idLocation, Client client, Voiture voiture, Date datedebutres, Date datefinres) {
        this.idLocation = idLocation;
        this.client = client;
        this.voiture = voiture;
        this.datedebutres = datedebutres;
        this.datefinres = datefinres;
    }

    @Override
    public String toString() {
        return "Location{" +
                "idLocation=" + idLocation +
                ", client=" + client +
                ", voiture=" + voiture +
                ", datedebutres=" + datedebutres +
                ", datefinres=" + datefinres +
                '}';
    }
    public Long getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Long idLocation) {
        this.idLocation = idLocation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public Date getDatedebutres() {
        return datedebutres;
    }

    public void setDatedebutres(Date datedebutres) {
        this.datedebutres = datedebutres;
    }
    public Date getDatefinres() {
        return datefinres;
    }

    public void setDatefinres(Date datefinres) {
        this.datefinres = datefinres;
    }
}
