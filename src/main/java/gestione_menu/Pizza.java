package gestione_menu;

import enums.PizzasEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Pizza {
	
	private PizzasEnum nomePizza;
	private long calorie;
	private double prezzo;
	@Override
	
	public String toString() {
		if(this.nomePizza==PizzasEnum.Margherita) {
			return "Pizza Margherita (tomato, cheese), calorie=" + calorie + ", prezzo=" + prezzo;
		}else if(this.nomePizza==PizzasEnum.Hawaiian) {
			return "Hawaiin Pizza (tomato, cheese, ham, pineapple), calorie=" + calorie + ", prezzo=" + prezzo;
		}else if(this.nomePizza==PizzasEnum.Salami) {
			return "Salami Pizza (tomato, cheese, salami), calorie=" + calorie + ", prezzo=" + prezzo;
		}
		return null;
	}
	
	
	
	
}