package configurationsPackages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import enums.DrinksEnum;
import gestione_menu.Drink;

@Configuration
public class ConfigurationDrink {

	@Bean(name = "drink")
	@Scope("prototype")
	public Drink drink(DrinksEnum drinks,double capacity, long calorie, double prezzo) {
		return new Drink(drinks,capacity, calorie, prezzo);
	}
}
