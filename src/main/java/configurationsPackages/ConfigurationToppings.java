package configurationsPackages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import enums.ToppingsEnum;
import gestione_menu.Cheese;
import gestione_menu.Ham;
import gestione_menu.Onions;
import gestione_menu.Pineapple;
import gestione_menu.Salami;
import gestione_menu.Tomato;
import gestione_menu.Topping;

@Configuration
public class ConfigurationToppings {

	@Bean
	public Cheese cheeseTopping() {
		return new Cheese();
	}
	
	@Bean
	public Tomato tomatoTopping() {
		return new Tomato();
	}
	
	@Bean
	public Ham hamTopping() {
		return new Ham();
	}
	
	@Bean
	public Onions onionsTopping() {
		return new Onions();
	}
	
	@Bean
	public Pineapple pineappleTopping() {
		return new Pineapple();
	}
	
	@Bean
	public Salami salamiTopping() {
		return new Salami();
	}
	
	
}
