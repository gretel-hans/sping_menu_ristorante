package gestioneOrdiniETavoli;

import org.springframework.context.annotation.Configuration;

import enums.StatoTavolo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Tavolo {

	private static int numeroTavolo;
	private int numeroCopertiMassimo;
	private StatoTavolo stato;
	
	public Tavolo(int numeroCopertiMassimo, StatoTavolo stato) {
		super();
		this.numeroCopertiMassimo = numeroCopertiMassimo;
		this.stato = stato;
		this.numeroTavolo+=1;
	}

	@Override
	public String toString() {
		return "Tavolo [Numero tavolo: "+this.numeroTavolo+", numero coperti massimo=" + numeroCopertiMassimo + ", stato=" + stato + "]";
	}
	
	public int getNumeroTavolo() {
		return this.numeroTavolo;
	}
}
