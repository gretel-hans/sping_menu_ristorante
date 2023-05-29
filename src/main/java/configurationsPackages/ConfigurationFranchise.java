package configurationsPackages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import enums.FranchiseEnum;
import gestione_menu.Franchise;

@Configuration
public class ConfigurationFranchise {

	@Bean
	@Scope("prototype")
	public Franchise franchise(FranchiseEnum oggetto, double prezzo) {
		return new Franchise(oggetto, prezzo);
	}
}
