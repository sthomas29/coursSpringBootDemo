package fr.eni.demo.controller;

import org.springframework.stereotype.Component;

// Grâce à @Component, Cette classe est identifiée comme un Bean dans le conteneur Spring
@Component
public class WelcomeController {

    public void welcome() {
        System.out.println("Bienvenue dans la démonstration de Container");
    }
}