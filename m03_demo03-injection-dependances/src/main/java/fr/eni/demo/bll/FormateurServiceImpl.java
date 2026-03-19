package fr.eni.demo.bll;

import fr.eni.demo.bo.Formateur;
import fr.eni.demo.dal.FormateurDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
