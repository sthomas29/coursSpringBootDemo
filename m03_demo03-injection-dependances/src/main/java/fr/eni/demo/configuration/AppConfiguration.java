package fr.eni.demo.configuration;

import fr.eni.demo.bll.FormateurService;
import fr.eni.demo.bll.FormateurServiceImpl;
import fr.eni.demo.bll.mock.FormateurServiceBouchon;
import fr.eni.demo.dal.FormateurDAO;
import fr.eni.demo.dal.mock.FormateurDAOBouchon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

// Définition d'une classe de configuration chargée au démarrage du conteneur
// et enregistrant les Bean déclarés par les méthodes.
@Configuration
public class AppConfiguration {

    @Bean
    FormateurDAO getBeanFormateurDAO() {
        return new FormateurDAOBouchon();
    }

    @Bean
    @Profile("default")
    FormateurService getBeanFormateurService() {
        return new FormateurServiceImpl(getBeanFormateurDAO());
    }

    @Bean
    @Profile("dev")
    FormateurService getBeanFormateurServiceBouchon() {
        return new FormateurServiceBouchon();
    }
}
