package fr.eni.demo.orchestre;

import java.util.ArrayList;
import java.util.List;

public class Orchestre {
    private List<Musicien> listeMusiciens;

    public Orchestre() {
        listeMusiciens = new ArrayList<>();
    }

    public void ajout(Musicien musicien) {
        listeMusiciens.add(musicien);
    }

    public void jouer() {
        for(Musicien musicien: listeMusiciens) {

            // Qu'importe l'instrument, le musicien peut jouer le morceau
            musicien.jouerMorceau();

            // Plus besoin de vérifier le type et de caster
            /*
            if(object instanceof Pianiste) {
                ((Pianiste) object).jouerMorceau();
            }
            if(object instanceof Violoniste) {
                ((Violoniste) object).jouerMorceau();
            }
            */
        }
    }
}