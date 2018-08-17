package com.mycompany.aquagroup.dao;

import com.mycompany.aquagroup.entity.Bazen;
import com.mycompany.aquagroup.entity.KategorijaBazena;
import com.mycompany.aquagroup.entity.Kontakt;
import com.mycompany.aquagroup.entity.Korisnik;
import com.mycompany.aquagroup.entity.Termin;
import com.mycompany.aquagroup.entity.ZakazivanjeTermina;
import java.util.List;


public interface AquaGroupDao {
    
    public List<Bazen> getBazeni();
    
    public Bazen getBazenById(int id);
    
    public List<KategorijaBazena> getKategorijeBazena();

    public KategorijaBazena getKategorijaBazenaById(int id);

    public List<Bazen> getBazeniByKategorijaBazena(KategorijaBazena kategorijaBazena);
    
    public KategorijaBazena addKategorijaBazena(KategorijaBazena kategorijaBazena);
    
    public Bazen addBazen(Bazen bazen);

    public Korisnik registration(Korisnik korisnik);
    
    public List<Korisnik> getKorisnici();
    
    public Korisnik getKorisnikById(int id);
    
    public void editKategorijaBazena(KategorijaBazena kategorijaBazena);
    
    public void deleteKategorijaBazena(KategorijaBazena kategorijaBazena);
    
    public void editBazen(Bazen bazen);
    
    public void deleteBazen(Bazen bazen);
    
    public List<Termin> getTermini();
    
    public Termin getTerminById(int id);
    
    public List<Termin> getTerminByBazen(Bazen bazen);
    
    public Termin addTermin(Termin termin);
    
    public void editTermin(Termin termin);
    
    public void deleteTermin(Termin termin);
    
    public ZakazivanjeTermina addZakazivanjeTermina(ZakazivanjeTermina zt);
    
    public List<ZakazivanjeTermina> getZakazaniTermini();
    
    public void deleteZakazaniTermin(ZakazivanjeTermina zt);
    
    public Korisnik findUserByEmail(String email);
    
    public Kontakt sendKontakt(Kontakt kontakt);
    
    public List<Kontakt> getKontaktPoruke();
    
    public void deleteKontaktPoruka(Kontakt kontakt);
    
    public Kontakt getKontaktPorukaById(int id);
    
    
}
