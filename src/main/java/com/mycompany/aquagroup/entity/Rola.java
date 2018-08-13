
package com.mycompany.aquagroup.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ROLA")
public class Rola {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDROLA")
    private Integer idRola;
    
    @Column(name = "NAZIVROLA")
    private String nazivRola;
    
    @Column(name = "ROLAAKTIVNA")
    private Integer rolaAktivna;

    public Integer getIdRola() {
        return idRola;
    }

    public void setIdRola(Integer idRola) {
        this.idRola = idRola;
    }

    public String getNazivRola() {
        return nazivRola;
    }

    public void setNazivRola(String nazivRola) {
        this.nazivRola = nazivRola;
    }

    public Integer getRolaAktivna() {
        return rolaAktivna;
    }

    public void setRolaAktivna(Integer rolaAktivna) {
        this.rolaAktivna = rolaAktivna;
    }

    @Override
    public String toString() {
        return "Rola{" + "idRola=" + idRola + ", nazivRola=" + nazivRola + ", rolaAktivna=" + rolaAktivna + '}';
    }
    
    
    
}
