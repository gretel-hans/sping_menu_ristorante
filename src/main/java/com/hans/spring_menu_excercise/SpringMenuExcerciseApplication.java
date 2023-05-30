package com.hans.spring_menu_excercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configurationsPackages.ConfigurationDrink;
import configurationsPackages.ConfigurationFamilySizePizza;
import configurationsPackages.ConfigurationFranchise;
import configurationsPackages.ConfigurationPizza;
import configurationsPackages.ConfigurationToppings;
import enums.DrinksEnum;
import enums.FranchiseEnum;
import enums.PizzasEnum;
import enums.ToppingsEnum;
import gestione_menu.Drink;
import gestione_menu.FamilySizePizza;
import gestione_menu.Franchise;
import gestione_menu.Pizza;
import gestione_menu.Topping;

@SpringBootApplication
public class SpringMenuExcerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMenuExcerciseApplication.class, args);
		compilaMenu();
	}

	public static void compilaMenu() {
		AnnotationConfigApplicationContext appContextPizza = new AnnotationConfigApplicationContext(ConfigurationPizza.class);
		System.out.println();
		System.out.println("------- MENU --------");
		System.out.println("Pizzas - Calories - Price");
		Pizza p1 =(Pizza) appContextPizza.getBean("pizzaMenu",PizzasEnum.Margherita,1104,4.99);
		System.out.println(p1.toString());
		Pizza p2 =(Pizza) appContextPizza.getBean("pizzaMenu",PizzasEnum.Hawaiian,1024,6.49);
		System.out.println(p2.toString());
		Pizza p3 =(Pizza) appContextPizza.getBean("pizzaMenu",PizzasEnum.Salami,1160,5.99);
		System.out.println(p3.toString());
		appContextPizza.close();
		AnnotationConfigApplicationContext appContextFamilySizePizza = new AnnotationConfigApplicationContext(ConfigurationFamilySizePizza.class);
		FamilySizePizza fsp= (FamilySizePizza) appContextFamilySizePizza.getBean("MenuFamilySizePizza");
		System.out.println(fsp);
		System.out.println();
		appContextFamilySizePizza.close();
		
		AnnotationConfigApplicationContext appContextToppings = new AnnotationConfigApplicationContext(ConfigurationToppings.class);
		System.out.println("Toppings - Calories - Price");
		Topping t1= (Topping) appContextToppings.getBean("topping",ToppingsEnum.Cheese,92,0.69);
		System.out.println(t1.toString());
		Topping t2= (Topping) appContextToppings.getBean("topping",ToppingsEnum.Ham,35,0.99);
		System.out.println(t2.toString());
		Topping t3= (Topping) appContextToppings.getBean("topping",ToppingsEnum.Onions,22,0.69);
		System.out.println(t3.toString());
		Topping t4= (Topping) appContextToppings.getBean("topping",ToppingsEnum.Pineapple,24,0.79);
		System.out.println(t4.toString());
		Topping t5= (Topping) appContextToppings.getBean("topping",ToppingsEnum.Salami,86,0.99);
		System.out.println(t5.toString());
		System.out.println();
		appContextToppings.close();
		
		AnnotationConfigApplicationContext appContextDrinks = new AnnotationConfigApplicationContext(ConfigurationDrink.class);
		System.out.println("Drinks - Calories - Price");
		Drink d1= (Drink) appContextDrinks.getBean("drink",DrinksEnum.Lemonade,0.33,128l,1.29);
		System.out.println(d1.toString());
		Drink d2= (Drink) appContextDrinks.getBean("drink",DrinksEnum.Water,0.5,0,1.29);
		System.out.println(d2.toString());
		Drink d3= (Drink) appContextDrinks.getBean("drink",DrinksEnum.Wine,0.75,607,7.49);
		System.out.println(d3.toString());
		System.out.println();
		appContextDrinks.close();
		
		AnnotationConfigApplicationContext appContextFranchise = new AnnotationConfigApplicationContext(ConfigurationFranchise.class);
		System.out.println("Franchise - Price");
		Franchise f1= (Franchise) appContextFranchise.getBean("franchise",FranchiseEnum.Shirt,21.99);
		System.out.println(f1.toString());
		Franchise f2= (Franchise) appContextFranchise.getBean("franchise",FranchiseEnum.Mug,4.99);
		System.out.println(f2.toString());
		appContextFranchise.close();
		
		
	}
}
