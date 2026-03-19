package fr.eni.demo.controller;

import java.util.List;

import org.springframework.stereotype.Component;

import fr.eni.demo.bll.FormateurService;
import fr.eni.demo.bo.Formateur;

@Component
public class FormateurController {

    private FormateurService formateurService;

    // Injection via le constructeur directement
    public FormateurController(FormateurService formateurService) {
        System.out.println("Appel du constructeur FormateurController");
        this.formateurService = formateurService;
    }

    public void afficherFormateurs() {
        List<Formateur> lstFormateurs = formateurService.getFormateurs();
        for  (Formateur formateur : lstFormateurs) {
            System.out.println(formateur);
        }
        System.out.println(lstFormateurs);
    }
}