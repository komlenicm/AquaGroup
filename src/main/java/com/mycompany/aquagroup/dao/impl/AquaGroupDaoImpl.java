package com.mycompany.aquagroup.dao.impl;

import com.mycompany.aquagroup.dao.AquaGroupDao;
import com.mycompany.aquagroup.entity.Bazen;
import com.mycompany.aquagroup.entity.KategorijaBazena;
import com.mycompany.aquagroup.entity.Kontakt;
import com.mycompany.aquagroup.entity.Korisnik;
import com.mycompany.aquagroup.entity.Termin;
import com.mycompany.aquagroup.entity.ZakazivanjeTermina;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("aquaGroupDao")
@Service
public class AquaGroupDaoImpl implements AquaGroupDao{
    
    
    
    @Autowired
    private SessionFactory sessionFactory;

    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    
    

    @Override
    @Transactional
    public List<Bazen> getBazeni() {
        List<Bazen> results = (List<Bazen>) getSession().createCriteria(Bazen.class).list();
        return results;
    }

    @Override
    @Transactional
    public Bazen getBazenById(int id) {
        Bazen bazen = (Bazen) getSession().createCriteria(Bazen.class).add(Restrictions.eq("idBazen", id)).uniqueResult();
        return bazen;
    }

    @Override
    @Transactional
    public List<KategorijaBazena> getKategorijeBazena() {
        List<KategorijaBazena> results = (List<KategorijaBazena>) getSession().createCriteria(KategorijaBazena.class).list();
        return results;
    }

    @Override
    @Transactional
    public KategorijaBazena getKategorijaBazenaById(int id) {
        KategorijaBazena kategorija = (KategorijaBazena) getSession().createCriteria(KategorijaBazena.class).add(Restrictions.eq("idKategorijaBazena", id)).uniqueResult();
        return kategorija;
    }

    @Override
    @Transactional
    public List<Bazen> getBazeniByKategorijaBazena(KategorijaBazena kategorijaBazena) {
        return (List<Bazen>) getSession().createCriteria(Bazen.class).add(Restrictions.eq("idKategorijaBazena", kategorijaBazena)).list();
    }

    @Override
    @Transactional
    public KategorijaBazena addKategorijaBazena(KategorijaBazena kategorijaBazena) {
        return (KategorijaBazena) getSession().merge(kategorijaBazena);
    }

    @Override
    @Transactional
    public Bazen addBazen(Bazen bazen) {
        return (Bazen) getSession().merge(bazen);
    }

    @Override
    @Transactional
    public Korisnik registration(Korisnik korisnik) {
        return (Korisnik) getSession().merge(korisnik);
    }

    @Override
    @Transactional
    public List<Korisnik> getKorisnici() {
        List<Korisnik> results = (List<Korisnik>) getSession().createCriteria(Korisnik.class).list();
        return results;
    }

    @Override
    @Transactional
    public Korisnik getKorisnikById(int id) {
        Korisnik korisnik = (Korisnik) getSession().createCriteria(Korisnik.class).add(Restrictions.eq("idKorisnik", id)).uniqueResult();
        return korisnik;
    }

    @Override
    @Transactional
    public void editKategorijaBazena(KategorijaBazena kategorijaBazena) {
        getSession().saveOrUpdate(kategorijaBazena);
    }

    @Override
    @Transactional
    public void deleteKategorijaBazena(KategorijaBazena kategorijaBazena) {
        getSession().delete(kategorijaBazena);
    }

    @Override
    @Transactional
    public void deleteBazen(Bazen bazen) {
        getSession().delete(bazen);
    }

    @Override
    @Transactional
    public List<Termin> getTermini() {
        List<Termin> results = (List<Termin>) getSession().createCriteria(Termin.class).list();
        return results;
    }

    @Override
    @Transactional
    public Termin getTerminById(int id) {
        Termin servis = (Termin) getSession().createCriteria(Termin.class).add(Restrictions.eq("idTermin", id)).uniqueResult();
        return servis;
    }

    @Override
    @Transactional
    public List<Termin> getTerminByBazen(Bazen bazen) {
        return (List<Termin>) getSession().createCriteria(Bazen.class).add(Restrictions.eq("idBazen", bazen)).list();
    }

    @Override
    @Transactional
    public Termin addTermin(Termin termin) {
        return (Termin) getSession().merge(termin);
    }

    @Override
    @Transactional
    public void editTermin(Termin termin) {
        getSession().saveOrUpdate(termin);
    }

    @Override
    @Transactional
    public void deleteTermin(Termin termin) {
        getSession().delete(termin);
    }

    @Override
    @Transactional
    public ZakazivanjeTermina addZakazivanjeTermina(ZakazivanjeTermina zt) {
        return (ZakazivanjeTermina) getSession().merge(zt);
    }

    @Override
    @Transactional
    public List<ZakazivanjeTermina> getZakazaniTermini() {
       List<ZakazivanjeTermina> results = (List<ZakazivanjeTermina>) getSession().createCriteria(ZakazivanjeTermina.class).list();
       return results;
    }

    @Override
    @Transactional
    public void deleteZakazaniTermin(ZakazivanjeTermina zt) {
        getSession().delete(zt);
    }

    @Override
    @Transactional
    public Korisnik findUserByEmail(String email) {
        Korisnik user = (Korisnik) getSession().createCriteria(Korisnik.class).add(Restrictions.eq("emailKorisnik", email)).uniqueResult();
        return user;
    }
    @Override
    @Transactional
    public Kontakt sendKontakt(Kontakt kontakt){
        return (Kontakt) getSession().merge(kontakt);
    }
    
    @Override
    @Transactional
    public List<Kontakt> getKontaktPoruke() {
       List<Kontakt> results = (List<Kontakt>) getSession().createCriteria(Kontakt.class).list();
       return results;
    }
    
    @Override
    @Transactional
    public void deleteKontaktPoruka(Kontakt Kontakt) {
        getSession().delete(Kontakt);
    }
    
    @Override
    @Transactional
    public Kontakt getKontaktPorukaById(int id) {
        Kontakt kontakt = (Kontakt) getSession().createCriteria(Kontakt.class).add(Restrictions.eq("idKontakt", id)).uniqueResult();
        return kontakt;
    }
    
}
