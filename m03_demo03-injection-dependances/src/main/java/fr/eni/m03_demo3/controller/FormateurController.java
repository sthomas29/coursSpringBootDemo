package fr.eni.m03_demo3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.eni.m03_demo3.bll.FormateurService;
import fr.eni.m03_demo3.bo.Formateur;

@Component
public class FormateurController {

    // Injection du service avec annotation
    @Autowired
    private FormateurService formateurService;

    public void afficherFormateurs() {
        List<Formateur> lstFormateurs = formateurService.getFormateurs();
        for  (Formateur formateur : lstFormateurs) {
            System.out.println(formateur);
        }
        System.out.println(lstFormateurs);
    }
}