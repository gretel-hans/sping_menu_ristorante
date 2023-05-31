package gestione_menu;

import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Configuration
@Getter
public class Onions extends Topping{
	
	private static String toppingName="Onions";
	private static double calorie=22;
	private static double prezzo=0.69;
	
	public Onions() {
		super(toppingName, calorie, prezzo);
	}
}
