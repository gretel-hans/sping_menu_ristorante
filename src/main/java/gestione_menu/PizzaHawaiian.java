package gestione_menu;


import enums.ToppingsEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter

public class PizzaHawaiian extends Pizza{
	
	private static String nomePizza="Hawaiian";
	private static Topping[] toppings= {new Cheese(),new Tomato(),new Ham(),new Pineapple()};
	private static double calorie=1204;
	private static double prezzo=6.49;
	


	public PizzaHawaiian() {
		super(nomePizza, toppings, calorie, prezzo);
		// TODO Auto-generated constructor stub
	}
	

	
}
