package configurationsPackages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import enums.ToppingsEnum;
import gestione_menu.Topping;

@Configuration
public class ConfigurationToppings {

	@Bean
	@Scope("prototype")
	public Topping topping(ToppingsEnum topping, long calorie, double prezzo) {
		return new Topping(topping, calorie, prezzo);
	}
}
