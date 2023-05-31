package gestione_menu;

import enums.ToppingsEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Topping {

	private String toppingName;
	private double calorie;
	private double prezzo;
	@Override
	public String toString() {
		return toppingName + ", calorie=" + calorie + ", prezzo=" + prezzo;
	}
	
	
}
