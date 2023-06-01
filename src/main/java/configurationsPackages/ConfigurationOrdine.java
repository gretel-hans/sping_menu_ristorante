package configurationsPackages;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import enums.StatoOrdine;
import gestioneOrdiniETavoli.Ordine;
import gestioneOrdiniETavoli.Tavolo;
import gestione_menu.Drink;
import gestione_menu.Pizza;

@Configuration
@PropertySource("classpath:application.properties")
public class ConfigurationOrdine {
	
	@Value("${costoCoperto}") private double costoPerCoperto;

	@Bean
	@Scope("prototype")
	public Ordine ordine(Tavolo tavolo, List<Drink> listaDrink, List<Pizza> listaPizze, StatoOrdine statoOrdine, int coperti) throws Exception {
		return new Ordine(tavolo, listaDrink, listaPizze, statoOrdine, coperti, costoPerCoperto);
	}
	
	
}
