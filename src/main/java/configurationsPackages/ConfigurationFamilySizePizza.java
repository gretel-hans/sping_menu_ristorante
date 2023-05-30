package configurationsPackages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import gestione_menu.FamilySizePizza;
import gestione_menu.Pizza;

@Configuration
public class ConfigurationFamilySizePizza {

	@Bean
	public FamilySizePizza MenuFamilySizePizza() {
		return new FamilySizePizza();
	}
	
	@Bean
	@Scope("prototype")
	public FamilySizePizza FamilySizePizza(Pizza pizza, long calorie, double prezzo) {
		return new FamilySizePizza(pizza, calorie, prezzo);
	}
}
