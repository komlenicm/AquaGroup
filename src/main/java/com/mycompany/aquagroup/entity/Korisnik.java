
package com.mycompany.aquagroup.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "KORISNIK")
public class Korisnik {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDKORISNIK")
    private Integer idKorisnik;
    
    @ManyToOne
    @JoinColumn(name = "IDROLA", referencedColumnName = "IDROLA")
    private Rola rola;
    
    @Column(name = "EMAILKORISNIK")
    private String emailKorisnik;
    
    @Column(name = "PASSWORD")
    private String password;
    
    @Column(name = "IMEKORISNIK")
    private String imeKorisnik;
    
    @Column(name = "PREZIMEKORISNIK")
    private String prezimeKorisnik;
    
    @Column(name = "ACTIVE")
    private boolean active;
    
    @Column(name = "REGISTROVANKORISNIK")
    private Timestamp registrovanKorisnik;

    public Integer getIdKorisnik() {
        return idKorisnik;
    }

    public void setIdKorisnik(Integer idKorisnik) {
        this.idKorisnik = idKorisnik;
    }

    public Rola getRola() {
        return rola;
    }

    public void setRola(Rola rola) {
        this.rola = rola;
    }

    public String getEmailKorisnik() {
        return emailKorisnik;
    }

    public void setEmailKorisnik(String emailKorisnik) {
        this.emailKorisnik = emailKorisnik;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImeKorisnik() {
        return imeKorisnik;
    }

    public void setImeKorisnik(String imeKorisnik) {
        this.imeKorisnik = imeKorisnik;
    }

    public String getPrezimeKorisnik() {
        return prezimeKorisnik;
    }

    public void setPrezimeKorisnik(String prezimeKorisnik) {
        this.prezimeKorisnik = prezimeKorisnik;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Timestamp getRegistrovanKorisnik() {
        return registrovanKorisnik;
    }

    public void setRegistrovanKorisnik(Timestamp registrovanKorisnik) {
        this.registrovanKorisnik = registrovanKorisnik;
    }

    @Override
    public String toString() {
        return "Korisnik{" + "idKorisnik=" + idKorisnik + ", rola=" + rola + ", emailKorisnik=" + emailKorisnik + ", password=" + password + ", imeKorisnik=" + imeKorisnik + ", prezimeKorisnik=" + prezimeKorisnik + ", active=" + active + ", registrovanKorisnik=" + registrovanKorisnik + '}';
    }
    
    
}
