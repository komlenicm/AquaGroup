
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
@Table(name = "TERMIN")
public class Termin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDTERMIN")
    private Integer idTermin;
    
    @ManyToOne
    @JoinColumn(name = "IDBAZEN", referencedColumnName = "IDBAZEN")
    private Bazen bazen;
    

    @Column(name = "VREMEOD")
    private String vremeOd;
    

    @Column(name = "VREMEDO")
    private String vremeDo;

    public Integer getIdTermin() {
        return idTermin;
    }

    public void setIdTermin(Integer idTermin) {
        this.idTermin = idTermin;
    }

    public Bazen getBazen() {
        return bazen;
    }

    public void setBazen(Bazen bazen) {
        this.bazen = bazen;
    }

    public String getVremeOd() {
        return vremeOd;
    }

    public void setVremeOd(String vremeOd) {
        this.vremeOd = vremeOd;
    }

    public String getVremeDo() {
        return vremeDo;
    }

    public void setVremeDo(String vremeDo) {
        this.vremeDo = vremeDo;
    }

    @Override
    public String toString() {
        return "Termin{" + "idTermin=" + idTermin + ", bazen=" + bazen + ", vremeOd=" + vremeOd + ", vremeDo=" + vremeDo + '}';
    }
    
    
}
