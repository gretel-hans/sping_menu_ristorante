package configurationsPackages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import enums.StatoTavolo;
import gestioneOrdiniETavoli.Tavolo;

@Configuration
public class ConfigurationTavolo {

	@Bean
	@Scope("prototype")
	
	public Tavolo nuovoTavolo(int numeroCopertiMassimo, StatoTavolo stato) {
		return new Tavolo(numeroCopertiMassimo, stato);
	}
}
