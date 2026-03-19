package fr.eni.demo.bll.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.eni.demo.bll.FormateurService;
import fr.eni.demo.bo.Formateur;

@Service
@Profile("dev")
public class FormateurServiceBouchon implements FormateurService {
    // Solution temporaire - gestion d'une liste de formateur locale
    private static List<Formateur> lstFormateurs;

    public FormateurServiceBouchon() {
        lstFormateurs = new ArrayList();
        lstFormateurs.add(new Formateur("Baille", "Anne-Lise", "abaille@campus-eni.fr"));
        lstFormateurs.add(new Formateur("Gobin", "Stéphane", "sgobin@campus-eni.fr"));
    }

    @Override
    public void add(String nom, String prenom, String email) {
        Formateur t = new Formateur(nom, prenom, email);
        lstFormateurs.add(t);
    }

    @Override
    public List getFormateurs() {
        return lstFormateurs;
    }
}