package gestione_menu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class FamilySizePizza {

	private Pizza pizza;
	private double calorie=1.95;
	private double prezzo=4.15;
	
	public FamilySizePizza(Pizza pizza,double calorie, double prezzo) {
		this.pizza=pizza;
		this.calorie=(pizza.getCalorie()*this.calorie);
		this.prezzo=(pizza.getPrezzo()+this.prezzo);
	}
	
	@Override
	public String toString() {
		if(this.pizza==null) {
			return "Family Size for Pizza calorie=" + calorie + ", prezzo=" + prezzo;
		}else if(this.pizza!=null) {
			return "Family Size for Pizza: "+this.pizza.getNomePizza()+", calorie:"+this.pizza.getCalorie()+", prezzo:"+this.pizza.getPrezzo();
		}
	}
	
}
