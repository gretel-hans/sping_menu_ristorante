package gestione_menu;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class Pizza {
	
	private String nomePizza;
	private Topping[] toppings;
	private double calorie;
	private double prezzo;
	private String notaPizza;
	
	
	public Pizza(String nomePizza, Topping[] toppings) {
		this.nomePizza = nomePizza;
		this.toppings = toppings;
		this.calorie=1104;
		this.prezzo=4.99;
	}
	
	public Pizza(String nomePizza, Topping[] toppings,String notaPizza) {
		this.nomePizza = nomePizza;
		this.toppings = toppings;
		this.calorie=1104;
		this.prezzo=4.99;
		this.notaPizza=notaPizza;
	}
	
	public Pizza(String nomePizza, Topping[] toppings, double calorie, double prezzo) {
		this.nomePizza = nomePizza;
		this.toppings = toppings;
		this.calorie=calorie;
		this.prezzo=prezzo;
	}
	
	public Pizza(String nomePizza, Topping[] toppings, double calorie, double prezzo, String notaPizza) {
		this.nomePizza = nomePizza;
		this.toppings = toppings;
		this.calorie=calorie;
		this.prezzo=prezzo;
		this.notaPizza=notaPizza;
	}
	
	
	
	@Override
	public String toString() {
		String ingredienti="";
		for(int i=0;i<toppings.length;i++) {
			if(i==toppings.length-1) {
				ingredienti+=toppings[i].getToppingName();
			}else {
				ingredienti+=toppings[i].getToppingName()+", ";				
			}
			this.calorie+=toppings[i].getCalorie();
			this.prezzo+=toppings[i].getPrezzo();
		}
			return "Pizza " +nomePizza+ " ("+ingredienti+"), calorie=" + calorie + ", prezzo=" + prezzo;
		
	}
	
	
}
