package gestione_menu;

import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Configuration
@Getter
public class Cheese extends Topping{
	
	private static String toppingName="Cheese";
	private static double calorie=92;
	private static double prezzo=0.69;
	
	public Cheese() {
		super(toppingName, calorie, prezzo);
	}
	
	
}
