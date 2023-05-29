package gestione_menu;
import enums.FranchiseEnum;
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
public class Franchise {
	
private FranchiseEnum franchise;
private double prezzo;
@Override
public String toString() {
	return  franchise + ", prezzo=" + prezzo;
}


}
