
package com.mycompany.aquagroup.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "KONTAKT")
public class Kontakt {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDKONTAKT")
    private Integer idKontakt;
    
    @Column(name = "IMEKONTAKT")
    private String imeKontakt;
    
    @Column(name = "EMAILKONTAKT")
    private String emailKontakt;
    
    @Column(name = "BROJTELEFONAKONTAKT")
    private String brojTelefonaKontakt;
    
    @Column(name = "NASLOVKONTAKT")
    private String naslovKontakt;
    
    @Column(name = "PORUKAKONTAKT")
    private String porukaKontakt;

    public Integer getIdKontakt() {
        return idKontakt;
    }

    public void setIdKontakt(Integer idKontakt) {
        this.idKontakt = idKontakt;
    }

    public String getImeKontakt() {
        return imeKontakt;
    }

    public void setImeKontakt(String imeKontakt) {
        this.imeKontakt = imeKontakt;
    }

    public String getEmailKontakt() {
        return emailKontakt;
    }

    public void setEmailKontakt(String emailKontakt) {
        this.emailKontakt = emailKontakt;
    }

    public String getBrojTelefonaKontakt() {
        return brojTelefonaKontakt;
    }

    public void setBrojTelefonaKontakt(String brojTelefonaKontakt) {
        this.brojTelefonaKontakt = brojTelefonaKontakt;
    }

    public String getNaslovKontakt() {
        return naslovKontakt;
    }

    public void setNaslovKontakt(String naslovKontakt) {
        this.naslovKontakt = naslovKontakt;
    }

    public String getPorukaKontakt() {
        return porukaKontakt;
    }

    public void setPorukaKontakt(String porukaKontakt) {
        this.porukaKontakt = porukaKontakt;
    }

    @Override
    public String toString() {
        return "Kontakt{" + "idKontakt=" + idKontakt + ", imeKontakt=" + imeKontakt + ", emailKontakt=" + emailKontakt + ", brojTelefonaKontakt=" + brojTelefonaKontakt + ", naslovKontakt=" + naslovKontakt + ", porukaKontakt=" + porukaKontakt + '}';
    }

    
    
    
    
}
