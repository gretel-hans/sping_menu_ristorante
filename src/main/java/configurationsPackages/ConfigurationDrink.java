package configurationsPackages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import enums.DrinksEnum;
import gestione_menu.Drink;
import gestione_menu.Lemonade;
import gestione_menu.Water;
import gestione_menu.Wine;

@Configuration
public class ConfigurationDrink {

	@Bean
	public Water waterDrink() {
		return new Water();
	}
	
	@Bean
	public Lemonade lemonadeDrink() {
		return new Lemonade();
	}
	
	@Bean
	public Wine wineDrink() {
		return new Wine();
	}
}
