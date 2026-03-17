package fr.eni.demo.orchestre;

public class DemoApplication {
    public static void main(String[] args) {
        System.out.println("Le pianiste : ");
        Pianiste pianiste = new Pianiste("La 9eme de Beethoven");
        pianiste.jouerMorceau();

        System.out.println("Le violoniste : ");
        Violoniste violoniste = new Violoniste("La 9eme de Beethoven");
        violoniste.jouerMorceau();

        System.out.println("L'orchestre : ");
        Orchestre orchestre = new Orchestre();
        orchestre.ajout(pianiste);
        orchestre.ajout(violoniste);
        orchestre.jouer();
    }
}