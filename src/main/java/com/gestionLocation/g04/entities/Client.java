package com.gestionLocation.g04.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity

public class Client {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idclient;
    private String nameclient;
    private String cinclient;
    private String numtelclient;
    private String permisclient;

    @OneToMany(mappedBy = "client")
    private Set<Location> location;

    public Client() {
        super();
    }


    @Override
    public String toString() {
        return "Client{" +
                "idclient=" + idclient +
                ", nameclient='" + nameclient + '\'' +
                ", cinclient='" + cinclient + '\'' +
                ", numtelclient='" + numtelclient + '\'' +
                ", permisclient='" + permisclient + '\'' +
                '}';
    }

    public Client(String nameclient, String cinclient, String numtelclient, String permisclient) {
        this.nameclient = nameclient;
        this.cinclient = cinclient;
        this.numtelclient = numtelclient;
        this.permisclient = permisclient;
    }

    public Long getIdclient() {
        return idclient;
    }

    public void setIdclient(Long idclient) {
        this.idclient = idclient;
    }

    public String getNameclient() {
        return nameclient;
    }

    public void setNameclient(String nameclient) {
        this.nameclient = nameclient;
    }

    public String getCinclient() {
        return cinclient;
    }

    public void setCinclient(String cinclient) {
        this.cinclient = cinclient;
    }

    public String getNumtelclient() {
        return numtelclient;
    }

    public void setNumtelclient(String numtelclient) {
        this.numtelclient = numtelclient;
    }

    public String getPermisclient() {
        return permisclient;
    }

    public void setPermisclient(String permisclient) {
        this.permisclient = permisclient;
    }
}
