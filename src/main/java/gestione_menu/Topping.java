package gestione_menu;

import enums.ToppingsEnum;
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
public class Topping {

	private ToppingsEnum topping;
	private double calorie;
	private double prezzo;
	@Override
	public String toString() {
		return topping + ", calorie=" + calorie + ", prezzo=" + prezzo;
	}
	
	
}
