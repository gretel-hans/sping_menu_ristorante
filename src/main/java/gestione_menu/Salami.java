package gestione_menu;

import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Configuration
@Getter
public class Salami extends Topping{
	
	private static String toppingName="Salami";
	private static double calorie=86;
	private static double prezzo=0.99;
	
	public Salami() {
		super(toppingName, calorie, prezzo);
	}
}
