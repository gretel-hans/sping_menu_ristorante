package gestioneOrdiniETavoli;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import enums.StatoOrdine;
import enums.StatoTavolo;
import gestione_menu.Drink;
import gestione_menu.Pizza;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Service
public class Ordine {

	private static int numeroOrdine;
	private Tavolo tavolo;
	private List<Drink> listaBevande;
	private List<Pizza> listaPizze;
	private String noteOrdine;
	private StatoOrdine stato;
	private int numeroCoperti;
	
	@Value("$(costo.coperto)")
	private double costoPerCoperto;
	
	private LocalTime oraAcquisizione;
	private double sommaTotaleORdine;
	
	public Ordine(Tavolo tavolo, List<Drink> listaBevande,List<Pizza> listaPizze, String noteOrdine, StatoOrdine stato, int numeroCoperti) {
		if(tavolo.getStato()==StatoTavolo.Occupato) {
			System.out.println("Tavolo occupato prenotare in un altro tavolo!");
		}else if(tavolo.getStato()==StatoTavolo.Libero) {
			if(this.numeroCoperti > tavolo.getNumeroCopertiMassimo()) {
				System.out.println("Tavolo con troppi pochi posti, prenotare un tavolo con almeno "+this.numeroCoperti+" posti!");
			}else if(this.numeroCoperti < tavolo.getNumeroCopertiMassimo()) {
		this.numeroOrdine+=1;
		this.tavolo = tavolo;
		this.listaBevande = listaBevande;
		this.listaPizze=listaPizze;
		this.noteOrdine = noteOrdine;
		this.stato = stato;
		this.numeroCoperti = numeroCoperti;
		listaBevande.forEach(e->this.sommaTotaleORdine+=e.getPrezzo());
		listaPizze.forEach(e->this.sommaTotaleORdine+=e.getPrezzo());
		this.sommaTotaleORdine+=this.costoPerCoperto*this.numeroCoperti;
		this.oraAcquisizione = LocalTime.now();
			}
		}
	}

	@Override
	public String toString() {
		return "Ordine [tavolo=" + tavolo + ", listaBevande=" + listaBevande + ", listaPizze=" + listaPizze
				+ ", noteOrdine=" + noteOrdine + ", stato=" + stato + ", numeroCoperti=" + numeroCoperti
				+ ", costoPerCoperto=" + costoPerCoperto + ", oraAcquisizione=" + oraAcquisizione
				+ ", sommaTotaleORdine=" + sommaTotaleORdine + "]";
	}
	
	
}
