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
@Table(name = "BAZEN")
public class Bazen {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDBAZEN")
    private Integer idBazen;
    
    @ManyToOne
    @JoinColumn(name = "IDKATEGORIJABAZENA", referencedColumnName = "IDKATEGORIJABAZENA")
    private KategorijaBazena kategorijaBazena;
    
    @Column(name = "IMEBAZEN")
    private String imeBazen;
    
    @Column(name = "CENAULAZNICE")
    private String cenaUlaznice;
    
    @Column(name = "OPIS")
    private String opis;
    
    @Column(name = "RADNOVREME")
    private String radnoVreme;

    public Integer getIdBazen() {
        return idBazen;
    }

    public void setIdBazen(Integer idBazen) {
        this.idBazen = idBazen;
    }

    public KategorijaBazena getKategorijaBazena() {
        return kategorijaBazena;
    }

    public void setKategorijaBazena(KategorijaBazena kategorijaBazena) {
        this.kategorijaBazena = kategorijaBazena;
    }

    public String getImeBazen() {
        return imeBazen;
    }

    public void setImeBazen(String imeBazen) {
        this.imeBazen = imeBazen;
    }

    public String getCenaUlaznice() {
        return cenaUlaznice;
    }

    public void setCenaUlaznice(String cenaUlaznice) {
        this.cenaUlaznice = cenaUlaznice;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getRadnoVreme() {
        return radnoVreme;
    }

    public void setRadnoVreme(String radnoVreme) {
        this.radnoVreme = radnoVreme;
    }

    @Override
    public String toString() {
        return "Bazen{" + "idBazen=" + idBazen + ", kategorijaBazena=" + kategorijaBazena + ", imeBazen=" + imeBazen + ", cenaUlaznice=" + cenaUlaznice + ", opis=" + opis + ", radnoVreme=" + radnoVreme + '}';
    }
    
    
    
}
