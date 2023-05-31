package gestione_menu;
import enums.DrinksEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Drink {
	
	private String drinkName;
	private double capacity;
	private double calorie;
	private double prezzo;
	
	
	
	@Override
	public String toString() {
		
			return  drinkName + " ("+capacity+"l), calorie=" + calorie + ", prezzo=" + prezzo;
	}



	

	
}
