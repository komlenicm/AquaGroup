package com.mycompany.aquagroup.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "KATEGORIJABAZENA")
public class KategorijaBazena {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDKATEGORIJABAZENA")
    private Integer idKategorijaBazena;

    @Column(name = "NAZIVKATEGORIJA")
    private String nazivKategorija;

    public Integer getIdKategorijaBazena() {
        return idKategorijaBazena;
    }

    public void setIdKategorijaBazena(Integer idKategorijaBazena) {
        this.idKategorijaBazena = idKategorijaBazena;
    }

    public String getNazivKategorija() {
        return nazivKategorija;
    }

    public void setNazivKategorija(String nazivKategorija) {
        this.nazivKategorija = nazivKategorija;
    }

    @Override
    public String toString() {
        return "KategorijaBazena{" + "idKategorijaBazena=" + idKategorijaBazena + ", nazivKategorija=" + nazivKategorija + '}';
    }
    
    
}
