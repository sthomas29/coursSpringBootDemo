package fr.eni.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // Définition du contexte avec ApplicationContext
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }

}
