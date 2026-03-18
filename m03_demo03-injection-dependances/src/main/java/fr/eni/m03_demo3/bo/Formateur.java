package fr.eni.m03_demo3.bo;

public class Formateur {
    private String nom;
    private String prenom;
    private String email;

    public Formateur() {
    }

    public Formateur(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Formateur{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}