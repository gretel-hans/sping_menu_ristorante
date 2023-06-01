package gestione_menu;


import enums.ToppingsEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter

public class PizzaMargherita extends Pizza{
	
	private static String nomePizza="Margherita";
	private static Topping[] toppings= {new Tomato(), new Cheese()};
	private static double calorie=1104;
	private static double prezzo=4.99;
	private String notaPizza;
	
	public PizzaMargherita() {
		super(nomePizza, toppings, calorie, prezzo);
	}
	
	public PizzaMargherita(String notaPizza) {
		super(nomePizza, toppings, calorie, prezzo, notaPizza);
	}
	
	
	
	
	
}
