package fr.eni.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import fr.eni.demo.bll.FormateurService;
import fr.eni.demo.bo.Formateur;

@Component
public class FormateurController {

    private FormateurService formateurService;

    // Pour lever l'ambiguîté du Bean à injecter, on ajouter l'annotation @Qualifier
    // pour spécifier l'instance concrète à injecter.

    // En forçant l'implémentation de FormateurServiceImpl avec @Primary, on s'affranchit de @Qualifier
    //@Qualifier("formateurServiceImpl")

    public FormateurController(  FormateurService formateurService) {
        System.out.println("Appel du constructeur FormateurController");
        this.formateurService = formateurService;
    }

    public void afficherFormateurs() {
        List<Formateur> lstFormateurs = formateurService.getFormateurs();
        for  (Formateur formateur : lstFormateurs) {
            System.out.println(formateur);
        }
        //System.out.println(lstFormateurs);
    }
}