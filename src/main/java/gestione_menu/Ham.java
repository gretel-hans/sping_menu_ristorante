package gestione_menu;

import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Configuration
@Getter
public class Ham extends Topping{
	
	private static String toppingName="Ham";
	private static double calorie=35;
	private static double prezzo=0.99;
	
	public Ham() {
		super(toppingName, calorie, prezzo);
	}
}
