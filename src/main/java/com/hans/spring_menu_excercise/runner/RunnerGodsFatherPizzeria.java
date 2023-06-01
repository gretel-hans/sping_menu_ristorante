package com.hans.spring_menu_excercise.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import configurationsPackages.ConfigurationDrink;
import configurationsPackages.ConfigurationFamilySizePizza;
import configurationsPackages.ConfigurationFranchise;
import configurationsPackages.ConfigurationOrdine;
import configurationsPackages.ConfigurationTavolo;
import configurationsPackages.ConfigurationToppings;
import configurationsPackages.PizzaConfiguration;
import enums.FranchiseEnum;
import enums.StatoOrdine;
import enums.StatoTavolo;
import gestioneOrdiniETavoli.Ordine;
import gestioneOrdiniETavoli.Tavolo;
import gestione_menu.Cheese;
import gestione_menu.Drink;
import gestione_menu.FamilySizePizza;
import gestione_menu.Franchise;
import gestione_menu.Ham;
import gestione_menu.Lemonade;
import gestione_menu.Onions;
import gestione_menu.Pineapple;
import gestione_menu.Pizza;
import gestione_menu.PizzaHawaiian;
import gestione_menu.PizzaMargherita;
import gestione_menu.PizzaSalami;
import gestione_menu.Salami;
import gestione_menu.Tomato;
import gestione_menu.Topping;
import gestione_menu.Water;
import gestione_menu.Wine;

@Component
public class RunnerGodsFatherPizzeria implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		compilaMenu();
		
		
	}
	public static void compilaMenu() {
		System.out.println();
		System.out.println("------- MENU --------");
		System.out.println("Pizzas - Calories - Price");
		
		AnnotationConfigApplicationContext appContextPizzaMenu = new AnnotationConfigApplicationContext(PizzaConfiguration.class);
		PizzaMargherita Margherita =(PizzaMargherita) appContextPizzaMenu.getBean("pizzaMargherita");
		System.out.println(Margherita.toString());
		
		PizzaHawaiian Hawaiian =(PizzaHawaiian) appContextPizzaMenu.getBean("pizzaHawaiian");
		System.out.println(Hawaiian.toString());
		
		PizzaSalami Salami =(PizzaSalami) appContextPizzaMenu.getBean("pizzaSalami");
		System.out.println(Salami.toString());
		
		
		
		appContextPizzaMenu.close();
		
		AnnotationConfigApplicationContext appContextFamilySizePizza = new AnnotationConfigApplicationContext(ConfigurationFamilySizePizza.class);
		FamilySizePizza fsp= (FamilySizePizza) appContextFamilySizePizza.getBean("MenuFamilySizePizza");
		System.out.println(fsp);
		System.out.println();
		appContextFamilySizePizza.close();
		
		AnnotationConfigApplicationContext appContextToppings = new AnnotationConfigApplicationContext(ConfigurationToppings.class);
		System.out.println("Toppings - Calories - Price");
		Cheese cheese= (Cheese) appContextToppings.getBean("cheeseTopping");
		System.out.println(cheese.toString());
		Tomato tomato= (Tomato) appContextToppings.getBean("tomatoTopping");
		System.out.println(tomato.toString());
		Ham ham= (Ham) appContextToppings.getBean("hamTopping");
		System.out.println(ham.toString());
		Onions onions= (Onions) appContextToppings.getBean("onionsTopping");
		System.out.println(onions.toString());
		Pineapple pineapple= (Pineapple) appContextToppings.getBean("pineappleTopping");
		System.out.println(pineapple.toString());
		Salami salami= (Salami) appContextToppings.getBean("salamiTopping");
		System.out.println(salami.toString());
		System.out.println();
		appContextToppings.close();
		
		AnnotationConfigApplicationContext appContextDrinks = new AnnotationConfigApplicationContext(ConfigurationDrink.class);
		System.out.println("Drinks - Calories - Price");
		Water water= (Water) appContextDrinks.getBean("waterDrink");
		System.out.println(water.toString());
		Lemonade lemonade= (Lemonade) appContextDrinks.getBean("lemonadeDrink");
		System.out.println(lemonade.toString());
		Wine wine= (Wine) appContextDrinks.getBean("wineDrink");
		System.out.println(wine.toString());
		System.out.println();
		appContextDrinks.close();
		
		AnnotationConfigApplicationContext appContextFranchise = new AnnotationConfigApplicationContext(ConfigurationFranchise.class);
		System.out.println("Franchise - Price");
		Franchise f1= (Franchise) appContextFranchise.getBean("franchise",FranchiseEnum.Shirt,21.99);
		System.out.println(f1.toString());
		Franchise f2= (Franchise) appContextFranchise.getBean("franchise",FranchiseEnum.Mug,4.99);
		System.out.println(f2.toString());
		appContextFranchise.close();
		
		AnnotationConfigApplicationContext appContextTavolo = new AnnotationConfigApplicationContext(ConfigurationTavolo.class);
		System.out.println();
		System.out.println("Tavoli - Numero coperti massimo - Stato");
		Tavolo tavolo1 = (Tavolo) appContextTavolo.getBean("nuovoTavolo",10,StatoTavolo.Libero);
		System.out.println(tavolo1);
		Tavolo tavolo2 = (Tavolo) appContextTavolo.getBean("nuovoTavolo",8,StatoTavolo.Occupato);
		System.out.println(tavolo2);
		System.out.println();
		
		List<Drink> listaDrink= new ArrayList<Drink>();
		listaDrink.add(water);
		listaDrink.add(water);
		listaDrink.add(lemonade);
		
		List<Pizza> listaPizze= new ArrayList<Pizza>();
		listaPizze.add(Margherita);
		listaPizze.add(Margherita);
		listaPizze.add(Hawaiian);
		//listaPizze.add(new Pizza("Diavola",new Topping[]{salami,cheese,tomato}));
		System.out.println("----- Ordini -----");
		AnnotationConfigApplicationContext appContextOrdine = new AnnotationConfigApplicationContext(ConfigurationOrdine.class);
		Ordine o1= (Ordine) appContextOrdine.getBean("ordine",tavolo1,listaDrink,listaPizze,StatoOrdine.Servito,4);
		System.out.println(o1.toString());
		
	}
}
