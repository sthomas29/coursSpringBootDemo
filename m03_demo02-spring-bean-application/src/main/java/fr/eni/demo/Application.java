package fr.eni.demo;

import fr.eni.demo.controller.WelcomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // Définition du contexte avec ApplicationContext
        ApplicationContext ctx = SpringApplication.run(Application.class, args);


        //Injection du bean directement depuis le contexte d'application
        WelcomeController welcomeController = (WelcomeController) ctx.getBean("welcomeController");

        // Injection du bean par le type, les beans sont des singletons dans le contexte d'application
        WelcomeController welcomeController1 = ctx.getBean(WelcomeController.class);

        welcomeController.welcome();

        System.out.println("welcomeCtrler  = " + welcomeController);
        System.out.println("welcomeCtrler1 = " + welcomeController1);
    }
}
