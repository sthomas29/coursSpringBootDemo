package fr.eni.m03_demo3;

import fr.eni.m03_demo3.controller.FormateurController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class M03Demo3InjectionDependancesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(M03Demo3InjectionDependancesApplication.class, args);

        FormateurController formateurCtrler = ctx.getBean(FormateurController.class);
        formateurCtrler.afficherFormateurs();
    }
}
