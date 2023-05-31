package gestione_menu;

import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Configuration
@Getter
public class Pineapple extends Topping{
	
	private static String toppingName="Pineapple";
	private static double calorie=24;
	private static double prezzo=0.79;
	
	public Pineapple() {
		super(toppingName, calorie, prezzo);
	}
}
