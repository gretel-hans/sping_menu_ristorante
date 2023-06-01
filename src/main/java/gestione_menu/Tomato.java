package gestione_menu;

import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Configuration
@Getter

public class Tomato extends Topping{
	
	private static String toppingName="Tomato";
	private static double calorie=40;
	private static double prezzo=0.50;
	
	public Tomato() {
		super(toppingName="Tomato", calorie=40, prezzo=0.50);
	}
}
