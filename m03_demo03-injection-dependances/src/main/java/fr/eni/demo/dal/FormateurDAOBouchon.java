package fr.eni.demo.dal;

import fr.eni.demo.bo.Formateur;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FormateurDAOBouchon implements FormateurDAO {

    // Solution temporaire - gestion d'une liste de formateur locale
    private static List<Formateur> lstFormateurs;

    public FormateurDAOBouchon() {
        lstFormateurs = new ArrayList<Formateur>();
        lstFormateurs.add(new Formateur("Baille", "Anne-Lise", "abaille@campus-eni.fr"));
        lstFormateurs.add(new Formateur("Gobin", "Stéphane", "sgobin@campus-eni.fr"));
        // Ajout d’un formateur pour différencier les bouchons des couches DAL et BLL
        lstFormateurs.add(new Formateur("Trillard", "Julien", "jtrillard@campus-eni.fr"));
    }

    @Override
    public void create(Formateur formateur) {
        lstFormateurs.add(formateur);
    }
    @Override
    public List<Formateur> findAll() {
        return lstFormateurs;
    }
}
