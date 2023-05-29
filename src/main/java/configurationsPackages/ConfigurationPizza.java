package configurationsPackages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import enums.PizzasEnum;
import gestione_menu.Pizza;

@Configuration
public class ConfigurationPizza {

	@Bean
	@Scope("prototype")
	public Pizza pizzaMenu(PizzasEnum pizza,long calorie, double prezzo) {
		return new Pizza(pizza, calorie, prezzo);
	} 
}
