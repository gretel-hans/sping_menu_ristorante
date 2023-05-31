package gestione_menu;


import enums.ToppingsEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter

public class PizzaSalami extends Pizza{
	
	private static String nomePizza="Salami";
	private static Topping[] toppings= {new Cheese(),new Tomato(),new Salami()};
	private static double calorie=1160;
	private static double prezzo=5.99;
	
	public PizzaSalami() {
		super(nomePizza, toppings, calorie, prezzo);
	}
	
	
	
	
	
	
}
