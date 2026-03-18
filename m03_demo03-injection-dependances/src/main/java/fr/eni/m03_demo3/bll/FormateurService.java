package fr.eni.m03_demo3.bll;

import java.util.List;

import fr.eni.m03_demo3.bo.Formateur;

public interface FormateurService {
    void add(String nom, String prenom, String email);

    List<Formateur> getFormateurs();
}