package configurationsPackages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import enums.ToppingsEnum;
import gestione_menu.Pizza;
import gestione_menu.PizzaHawaiian;
import gestione_menu.PizzaMargherita;
import gestione_menu.PizzaSalami;
import gestione_menu.Topping;

@Configuration
public class PizzaConfiguration {

	@Bean
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean
	public PizzaHawaiian pizzaHawaiian() {
		return new PizzaHawaiian();
	}
	
	@Bean
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}
	
	@Bean
	@Scope("prototype")
	public Pizza pizzaSpeciale(String pizza, Topping[] toppings) {
		return new Pizza(pizza,toppings);
	}
}
