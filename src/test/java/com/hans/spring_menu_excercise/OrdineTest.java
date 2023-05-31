package com.hans.spring_menu_excercise;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configurationsPackages.ConfigurationDrink;
import configurationsPackages.ConfigurationTavolo;
import configurationsPackages.PizzaConfiguration;
import enums.StatoOrdine;
import enums.StatoTavolo;
import gestioneOrdiniETavoli.Ordine;
import gestioneOrdiniETavoli.Tavolo;
import gestione_menu.Drink;
import gestione_menu.Lemonade;
import gestione_menu.Pizza;
import gestione_menu.PizzaHawaiian;
import gestione_menu.PizzaMargherita;
import gestione_menu.PizzaSalami;
import gestione_menu.Topping;
import gestione_menu.Water;
import gestione_menu.Wine;

class OrdineTest {
public static Water water;
public static PizzaMargherita Margherita;
public static Tavolo tavolo1;
public static Ordine o1;
	
	@BeforeAll
	public static void inizializzazione() {
		AnnotationConfigApplicationContext appContextPizzaMenu = new AnnotationConfigApplicationContext(PizzaConfiguration.class);
		Margherita =(PizzaMargherita) appContextPizzaMenu.getBean("pizzaMargherita");
		System.out.println(Margherita.toString());
		
		
		AnnotationConfigApplicationContext appContextDrinks = new AnnotationConfigApplicationContext(ConfigurationDrink.class);
		System.out.println("Drinks - Calories - Price");
		water= (Water) appContextDrinks.getBean("waterDrink");
		System.out.println(water.toString());
		
		appContextDrinks.close();
		
		AnnotationConfigApplicationContext appContextTavolo = new AnnotationConfigApplicationContext(ConfigurationTavolo.class);
		System.out.println();
		System.out.println("Tavoli - Numero coperti massimo - Stato");
		tavolo1 = (Tavolo) appContextTavolo.getBean("nuovoTavolo",10,StatoTavolo.Occupato);
		System.out.println(tavolo1);
		
		List<Drink> listaDrink= new ArrayList<Drink>();
		listaDrink.add(water);
		listaDrink.add(water);
		
		List<Pizza> listaPizze= new ArrayList<Pizza>();
		listaPizze.add(Margherita);
		listaPizze.add(Margherita);
		System.out.println("----- Ordini -----");
		o1= new Ordine(tavolo1,listaDrink,listaPizze,"",StatoOrdine.Servito,21);
		System.out.println(o1.toString());
	}
	@Test
	void test() {
		
		assertNull(o1.getListaBevande());
	}

}
