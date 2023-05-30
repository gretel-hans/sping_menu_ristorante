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
	
	private DrinksEnum drink;
	private double capacity;
	private double calorie;
	private double prezzo;
	
	
	
	@Override
	public String toString() {
		if(this.drink==DrinksEnum.Lemonade) {
		return  drink + " ("+capacity+"l), calorie=" + calorie + ", prezzo=" + prezzo;
		}else if(this.drink==DrinksEnum.Water) {
			return  drink + " ("+capacity+"l), calorie=" + calorie + ", prezzo=" + prezzo;
		}else if(this.drink==DrinksEnum.Wine) {
			return  drink + " ("+capacity+"l, 13%), calorie=" + calorie + ", prezzo=" + prezzo;
		}
		return null;
	}



	

	
}
