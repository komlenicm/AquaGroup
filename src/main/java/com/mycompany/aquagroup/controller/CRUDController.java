package com.mycompany.aquagroup.controller;

import com.mycompany.aquagroup.dao.AquaGroupDao;
import com.mycompany.aquagroup.entity.Bazen;
import com.mycompany.aquagroup.entity.KategorijaBazena;
import com.mycompany.aquagroup.entity.Kontakt;
import com.mycompany.aquagroup.entity.Korisnik;
import com.mycompany.aquagroup.entity.Rola;
import com.mycompany.aquagroup.entity.Termin;
import com.mycompany.aquagroup.entity.ZakazivanjeTermina;
import com.mycompany.aquagroup.service.AquaGroupService;
import java.security.Principal;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CRUDController {
    
    @Autowired
    AquaGroupDao aquaGroupDao;
    
    @Autowired
    AquaGroupService aquaGroupService;
    
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView model = new ModelAndView();
        model.setViewName("home");
        return model;
    }
    
    @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("home");
        return model;
    }
    
    @RequestMapping(value = "/galerija", method = RequestMethod.GET)
    public String galerija(Model model) {
        return "galerija";
    }
    
    
    @RequestMapping(value = "/onama", method = RequestMethod.GET)
    public String onama(Model model) {
        return "onama";
    }
    
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("korisnik", new Korisnik());
        return "registration";
    }
    
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView registration(@ModelAttribute("korisnik") Korisnik k, ModelAndView model) {
        k.setActive(true);
        Rola rola = new Rola();
        rola.setIdRola(2);
        k.setRola(rola);
        k = aquaGroupService.registration(k);
        model.addObject("successMsg", "Registracija je uspesna!");
        model.addObject("korisnik", k);
        return model;
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView model = new ModelAndView();

        if (error != null) {
            model.addObject("error", "Uneti podaci su neispravni!");
        }
        if (logout != null) {
            model.addObject("msg", "Uspesno ste se odjavili");
        }
        model.setViewName("login");
        return model;
    }
    
    
    @RequestMapping(value = "/viewKategorijeBazena", method = RequestMethod.GET)
    public ModelAndView getKategorijeBazena(ModelAndView model) {
        model.addObject("kategorijeBazena", aquaGroupService.getKategorijeBazena());
        model.addObject("kategorijaBazena", new KategorijaBazena());
        return model;
    }
    
    @RequestMapping(value = "/editKategorijaBazena/{idKategorijaBazena}", method = RequestMethod.GET)
    public String editKategorijaBazena(@PathVariable("idKategorijaBazena") int id, Model model) {
        KategorijaBazena kb = aquaGroupService.getKategorijaBazenaById(id);
        model.addAttribute("kategorijaBazena", kb);
        return "addKategorijaBazena";
    }
    
    @RequestMapping(value = "/deleteKategorijaBazena/{idKategorijaBazena}", method = RequestMethod.GET)
    public String deleteKategorijaBazena(@PathVariable("idKategorijaBazena") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting kategorija bazena with id " + id);
 
        KategorijaBazena kb = aquaGroupService.getKategorijaBazenaById(id);
        if (kb == null) {
            System.out.println("Nije moguce izvrsiti brisanje. Kategorija bazena sa id " + id + " nije pronadjena.");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

       
        aquaGroupService.deleteKategorijaBazena(kb);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
    
    @RequestMapping(value = "/addBazen", method = RequestMethod.GET)
    public String addBazen(Model model) {
        model.addAttribute("bazen", new Bazen());
        model.addAttribute("kategorijeBazena", aquaGroupService.getKategorijeBazena());
        return "addBazen";
    }

    @RequestMapping(value = "/addBazen", method = RequestMethod.POST)
    public ModelAndView addBazen(@ModelAttribute("bazen") Bazen b, ModelAndView model) {
        b = aquaGroupService.addBazen(b);
        model.addObject("kategorijeBazena", aquaGroupService.getKategorijeBazena());
        model.addObject("successMsg", "Bazen je uspesno dodat!");
        model.addObject("bazen", b);
        return model;
    }
    
    @RequestMapping(value = "/viewBazeni", method = RequestMethod.GET)
    public ModelAndView getBazeni(ModelAndView model) {
        model.addObject("bazeni", aquaGroupService.getBazeni());
        model.addObject("bazen", new Bazen());
        return model;
    }
    
    @RequestMapping(value = "/deleteBazen/{idBazen}", method = RequestMethod.GET)
    public String deleteBazen(@PathVariable("idBazen") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting bazen with id " + id);
 
        Bazen b = aquaGroupService.getBazenById(id);
        if (b == null) {
            System.out.println("Nije moguce izvrsiti brisanje. Bazen sa id " + id + " nije pronadjen.");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

       
        aquaGroupService.deleteBazen(b);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
    
    @RequestMapping(value = "/zakazivanjeTermina", method = RequestMethod.GET)
    public String zakazivanjeTermina(Model model) {
        model.addAttribute("zakazivanjeTermina", new ZakazivanjeTermina());
        return "zakazivanjeTermina";
    }
   
    
    @RequestMapping(value = "/zakazivanjeTermina", method = RequestMethod.POST)
    public ModelAndView zakazivanjeTermina(@ModelAttribute("zakazivanjeTermina") ZakazivanjeTermina zt, ModelAndView model, Principal principal) {
        String name = principal.getName();
        Korisnik k = aquaGroupService.findUserByEmail(name);
        zt.setKorisnik(k);
        aquaGroupService.addZakazivanjeTermina(zt);
        model.addObject("successMsg", "Zahtev za rezervaciju termina je uspesno poslat!");
        return model;
    }
    
    @RequestMapping(value = "/addTermin", method = RequestMethod.GET)
    public String addTermin(Model model) {
        model.addAttribute("termin", new Termin());
        model.addAttribute("bazeni", aquaGroupService.getBazeni());
        model.addAttribute("zakazaniTermini",  aquaGroupService.getZakazaniTermini());
        model.addAttribute("zakazaniTermin", new ZakazivanjeTermina());
        return "addTermin";
    }

    @RequestMapping(value = "/addTermin", method = RequestMethod.POST)
    public ModelAndView addTermin(@ModelAttribute("termin") Termin t, ModelAndView model) {
        t = aquaGroupService.addTermin(t);
        model.addObject("bazeni", aquaGroupService.getBazeni());
        model.addObject("successMsg", "Termin je uspesno rezervisan!");
        model.addObject("termin", t);
        return model;
    }
    
    @RequestMapping(value = "/viewTermini", method = RequestMethod.GET)
    public ModelAndView getTermini(ModelAndView model) {
        model.addObject("termini", aquaGroupService.getTermini());
        model.addObject("termin", new Termin());
        return model;
    }
    
    @RequestMapping(value = "/deleteTermin/{idTermin}", method = RequestMethod.GET)
    public String deleteTermin(@PathVariable("idTermin") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting termin with id " + id);
        Termin t = aquaGroupService.getTerminById(id);
        if (t == null) {
            System.out.println("Nije moguce izvrsiti brisanje. Termin sa id " + id + " nije pronadjen.");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

       
        aquaGroupService.deleteTermin(t);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
    
    @RequestMapping(value = "/kontakt", method = RequestMethod.GET)
    public String kontakt(Model model) {
        model.addAttribute("kontakt", new Kontakt());
        return "kontakt";
    }
   
    
    @RequestMapping(value = "/kontakt", method = RequestMethod.POST)
    public ModelAndView kontakt(@ModelAttribute("kontakt") Kontakt k, ModelAndView model) {
        aquaGroupService.sendKontakt(k);
        model.addObject("successMsg", "Kontakt poruka je uspesno poslata!");
        return model;
    }
    
    @RequestMapping(value = "/viewKontaktPoruke", method = RequestMethod.GET)
    public ModelAndView getKontaktPoruke(ModelAndView model) {
        model.addObject("poruke", aquaGroupService.getKontaktPoruke());
        model.addObject("poruka", new Kontakt());
        return model;
    }
    
        @RequestMapping(value = "/deleteKontaktPoruka/{idKontakt}", method = RequestMethod.GET)
    public String deleteKontaktPoruka(@PathVariable("idKontakt") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting kontakt poruka with id " + id);
 
        Kontakt k = aquaGroupService.getKontaktPorukaById(id);
        if (k == null) {
            System.out.println("Nije moguce izvrsiti brisanje. Kontakt poruka sa id " + id + " nije pronadjena.");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

       
        aquaGroupService.deleteKontaktPoruka(k);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
    
}
