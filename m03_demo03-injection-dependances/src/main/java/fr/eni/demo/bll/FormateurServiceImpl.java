package fr.eni.demo.bll;

import fr.eni.demo.bo.Formateur;
import fr.eni.demo.dal.FormateurDAO;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

// Ajout @Primary pour imposer à Spring l'utilisation de ce Bean.
//@Service
@Profile("default")
public class FormateurServiceImpl implements FormateurService {
    private FormateurDAO formateurDAO;

    public FormateurServiceImpl(FormateurDAO formateurDAO) {
        this.formateurDAO = formateurDAO;
    }

    @Override
    public void add(String nom, String prenom, String email) {
        Formateur formateur = new Formateur(nom, prenom, email);
        formateurDAO.create(formateur);
    }
    @Override
    public List<Formateur> getFormateurs() {
        System.out.println("From Implémentation");
        return formateurDAO.findAll();
    }
}
