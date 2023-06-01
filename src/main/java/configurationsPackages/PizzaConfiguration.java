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
	@Scope("prototype")
	public PizzaMargherita pizzaMargheritaConNota(String nota) {
		return new PizzaMargherita(nota);
	}
	
	@Bean
	public PizzaHawaiian pizzaHawaiian() {
		return new PizzaHawaiian();
	}
	
	@Bean
	@Scope("prototype")
	public PizzaHawaiian pizzaHawaiianConNota(String nota) {
		return new PizzaHawaiian(nota);
	}
	
	@Bean
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}
	
	@Bean
	@Scope("prototype")
	public PizzaSalami pizzaSalamiConNota(String nota) {
		return new PizzaSalami(nota);
	}
	
	@Bean
	@Scope("prototype")
	public Pizza pizzaSpeciale(String pizza, Topping[] toppings) {
		return new Pizza(pizza,toppings);
	}
	
	@Bean
	@Scope("prototype")
	public Pizza pizzaSpecialeConNota(String pizza, Topping[] toppings, String nota) {
		return new Pizza(pizza,toppings,nota);
	}
}
