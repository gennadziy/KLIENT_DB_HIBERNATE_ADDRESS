package gennadziy.controller;

import gennadziy.model.Adress;
import gennadziy.model.Klient;
import gennadziy.service.AdressService;
import gennadziy.service.KlientService;
import gennadziy.service.KlientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class KlientController {

    private AdressService adressService;


    @Autowired
    public void setAdressService ( AdressService adressService ) {
        this.adressService = adressService;
    }

    private KlientService klientService;

    @Autowired
    public void setKlientService(KlientService klientService) {
        this.klientService = klientService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allKlients() {
        List<Klient> klients = klientService.allKlients();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("klients");
        modelAndView.addObject("klienstList", klients);
        return modelAndView;
    }

    @RequestMapping(value = "/adr", method = RequestMethod.GET)
    public ModelAndView allAdress() {
        List<Adress> adresses = adressService.allAdress();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adress");
        modelAndView.addObject("adresses", adresses);
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editKlient(@ModelAttribute("klient") Klient klient) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        klientService.edit(klient);
        return modelAndView;
    }
    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteKlient(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        Klient klient = klientService.getById(id);
        klientService.delete(klient);
        return modelAndView;
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPage(@PathVariable("id") int id) {
        Klient klient = klientService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        modelAndView.addObject("klient", klient);
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

    @GetMapping(value = "/new")
    public String greeting1( @RequestParam(name="name", required=false, defaultValue="Люба")
        String name, Model model) {
        model.asMap ();
        model.addAttribute ("name", name);
        return "new";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addKlient(@ModelAttribute("klient") Klient klient) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        klientService.add(klient);
        return modelAndView;
    }
}
