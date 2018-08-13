
package com.mycompany.aquagroup.service.impl;

import com.mycompany.aquagroup.dao.AquaGroupDao;
import com.mycompany.aquagroup.entity.Bazen;
import com.mycompany.aquagroup.entity.KategorijaBazena;
import com.mycompany.aquagroup.entity.Kontakt;
import com.mycompany.aquagroup.entity.Korisnik;
import com.mycompany.aquagroup.entity.Termin;
import com.mycompany.aquagroup.entity.ZakazivanjeTermina;
import com.mycompany.aquagroup.service.AquaGroupService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AquaGroupServiceImpl implements AquaGroupService{
    
    @Autowired
    AquaGroupDao aquaGroupDao;

    @Override
    public List<Bazen> getBazeni() {
        return aquaGroupDao.getBazeni();
    }

    @Override
    public Bazen getBazenById(int id) {
        return aquaGroupDao.getBazenById(id);
    }

    @Override
    public List<KategorijaBazena> getKategorijeBazena() {
        return aquaGroupDao.getKategorijeBazena();
    }

    @Override
    public KategorijaBazena getKategorijaBazenaById(int id) {
        return aquaGroupDao.getKategorijaBazenaById(id);
    }

    @Override
    public List<Bazen> getBazeniByKategorijaBazena(KategorijaBazena kategorijaBazena) {
        return aquaGroupDao.getBazeniByKategorijaBazena(kategorijaBazena);
    }

    @Override
    public KategorijaBazena addKategorijaBazena(KategorijaBazena kategorijaBazena) {
        return aquaGroupDao.addKategorijaBazena(kategorijaBazena);
    }

    @Override
    public Bazen addBazen(Bazen bazen) {
        return aquaGroupDao.addBazen(bazen);
    }

    @Override
    public Korisnik registration(Korisnik korisnik) {
        return aquaGroupDao.registration(korisnik);
    }

    @Override
    public List<Korisnik> getKorisnici() {
        return aquaGroupDao.getKorisnici();
    }

    @Override
    public Korisnik getKorisnikById(int id) {
        return aquaGroupDao.getKorisnikById(id);
    }

    @Override
    public void editKategorijaBazena(KategorijaBazena kategorijaBazena) {
        aquaGroupDao.editKategorijaBazena(kategorijaBazena);
    }

    @Override
    public void deleteKategorijaBazena(KategorijaBazena kategorijaBazena) {
        aquaGroupDao.deleteKategorijaBazena(kategorijaBazena);
    }

    @Override
    public void deleteBazen(Bazen bazen) {
        aquaGroupDao.deleteBazen(bazen);
    }

    @Override
    public List<Termin> getTermini() {
        return aquaGroupDao.getTermini();
    }

    @Override
    public Termin getTerminById(int id) {
        return aquaGroupDao.getTerminById(id);
    }

    @Override
    public List<Termin> getTerminByBazen(Bazen bazen) {
        return aquaGroupDao.getTerminByBazen(bazen);
    }

    @Override
    public Termin addTermin(Termin termin) {
        return aquaGroupDao.addTermin(termin);
    }

    @Override
    public void editTermin(Termin termin) {
        aquaGroupDao.editTermin(termin);
    }

    @Override
    public void deleteTermin(Termin termin) {
       aquaGroupDao.deleteTermin(termin);
    }

    @Override
    public ZakazivanjeTermina addZakazivanjeTermina(ZakazivanjeTermina zt) {
        return aquaGroupDao.addZakazivanjeTermina(zt);
    }

    @Override
    public List<ZakazivanjeTermina> getZakazaniTermini() {
        return aquaGroupDao.getZakazaniTermini();
    }

    @Override
    public void deleteZakazaniTermin(ZakazivanjeTermina zt) {
        aquaGroupDao.deleteZakazaniTermin(zt);
    }

    @Override
    public Korisnik findUserByEmail(String email) {
        return aquaGroupDao.findUserByEmail(email);
    }
    
    @Override
    public Kontakt sendKontakt(Kontakt kt) {
        return aquaGroupDao.sendKontakt(kt);
    }

    @Override
    public List<Kontakt> getKontaktPoruke() {
        return aquaGroupDao.getKontaktPoruke();
    }
    
    @Override
    public void deleteKontaktPoruka(Kontakt k) {
        aquaGroupDao.deleteKontaktPoruka(k);
    }
    
    @Override
    public Kontakt getKontaktPorukaById(int id) {
        return aquaGroupDao.getKontaktPorukaById(id);
    }
    
    
}
