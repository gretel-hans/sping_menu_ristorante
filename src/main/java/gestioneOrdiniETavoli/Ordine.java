package gestioneOrdiniETavoli;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

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

public class Ordine {

	private static int numeroOrdine;
	private Tavolo tavolo;
	private List<Drink> listaBevande;
	private List<Pizza> listaPizze;
	private StatoOrdine stato;
	private int numeroCoperti;
	private double costoPerCoperto;
	
	
	private LocalDateTime oraAcquisizione;
	private double sommaTotaleORdine;
	
	
	public Ordine(Tavolo tavolo, List<Drink> listaBevande,List<Pizza> listaPizze, StatoOrdine stato, int numeroCoperti,double costoPerCoperto) throws Exception {
		if(tavolo.getStato()==StatoTavolo.Occupato) {
			throw new Exception("Tavolo occupato prenotare in un altro tavolo!");
		}else if(tavolo.getStato()==StatoTavolo.Libero) {
			System.out.println("numero coperti: "+numeroCoperti+" numero massimo: "+tavolo.getNumeroCopertiMassimo());
			if(numeroCoperti > tavolo.getNumeroCopertiMassimo()) {
			throw new Exception("Tavolo con troppi pochi posti, prenotare un tavolo con almeno "+this.numeroCoperti+" posti!");
			}else if(numeroCoperti < tavolo.getNumeroCopertiMassimo()) {
		this.numeroOrdine+=1;
		this.tavolo = tavolo;
		this.listaBevande = listaBevande;
		this.listaPizze=listaPizze;		this.stato = stato;
		this.numeroCoperti = numeroCoperti;
		System.out.println("1 "+sommaTotaleORdine);
		listaBevande.forEach(e->this.sommaTotaleORdine+=e.getPrezzo());
		System.out.println("2 "+sommaTotaleORdine);
		listaPizze.forEach(e->this.sommaTotaleORdine+=e.getPrezzo());
		System.out.println("3 "+sommaTotaleORdine);
		this.sommaTotaleORdine+=(this.costoPerCoperto * this.numeroCoperti);
		this.oraAcquisizione = LocalDateTime.now();
		this.costoPerCoperto=costoPerCoperto;
		System.out.println("4 "+sommaTotaleORdine);
			}
		}
	}

	@Override
	public String toString() {
		List<String> listaBevandeDaStampare=new ArrayList<String>();
		listaBevande.forEach(e->listaBevandeDaStampare.add(e.getDrinkName()));
		List<String> listaPizzeDaStampare=new ArrayList<String>();
		listaPizze.forEach(e->listaPizzeDaStampare.add(e.getNomePizza()));
		return "Ordine n."+ this.numeroOrdine+"\nTavolo n." + tavolo.getNumeroTavolo()+" numero massimo coperti: "+tavolo.getNumeroCopertiMassimo()+ "\nBevande ordinate " + listaBevandeDaStampare + "\nPizze ordinate " + listaPizzeDaStampare
				+ ", stato=" + stato + ", numero coperti=" + numeroCoperti
				+ ", costo per coperto=" + costoPerCoperto + ", ora acquisizione=" + oraAcquisizione
				+ ", costo totale ordine=" + sommaTotaleORdine + "€ ]";
	}
	
	
}
