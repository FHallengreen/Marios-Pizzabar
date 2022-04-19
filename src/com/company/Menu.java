package com.company;

import java.util.ArrayList;

public class Menu {
  ArrayList<Pizza> pizzaMenu = new ArrayList();

  public Menu() {
    Pizza pizza1 = new Pizza(1, "Vesuvio", "Tomatsauce, ost, skinke & oregano.", 57);
    Pizza pizza2 = new Pizza(2, "Amerikaner", "Tomatsauce, ost, oksefars & oregano.", 53);
    Pizza pizza3 = new Pizza(3, "Cacciatore", "Tomatsauce, ost, pepperoni & oregano.", 57);
    Pizza pizza4 = new Pizza(4,"Carbona","Tomatsauce, ost, kødsauce, spaghetti, cocktailpølser & oregano", 63);
    Pizza pizza5 = new Pizza(5,"Dennis","Tomatsauce, ost, skinke, pepperoni, cocktailpølser & oregano.", 65);
    Pizza pizza6 = new Pizza(6,"Bertil","Tomatsauce, ost, bacon & oregano.", 57);
    Pizza pizza7 = new Pizza(7,"Silvia","Tomatsauce, ost, pepperoni, rød peber, løg, oliven & oregano.", 61);
    Pizza pizza8 = new Pizza(8,"Victoria","Tomatsauce, ost, skinke, ananas, champignon, løg & oregano.", 61);
    Pizza pizza9 = new Pizza(9,"Toronfo","Tomatsauce, ost, skinke, bacon, kebab, chili & oregano.", 61);
    Pizza pizza10 = new Pizza(10,"Capricciosa","Tomatsauce, ost, skinke, champignon & oregano.", 61);
    Pizza pizza11 = new Pizza(11,"Hawaii","Tomatsauce, ost, skinke, ananas & oregano.", 61);
    Pizza pizza12 = new Pizza(12,"Le Blissola","Tomatsauce, ost, skinke, rejer & oregano.", 61);
    Pizza pizza13 = new Pizza(13,"Venezia","Tomatsauce, ost, bacon & oregano.", 61);
    Pizza pizza14 = new Pizza(14,"Mafia","Tomatsauce, ost, pepperoni, bacon, løg & oregano.", 61);

    addPizza(pizza1);
    addPizza(pizza2);
    addPizza(pizza3);
    addPizza(pizza4);
    addPizza(pizza5);
    addPizza(pizza6);
    addPizza(pizza7);
    addPizza(pizza8);
    addPizza(pizza9);
    addPizza(pizza10);
    addPizza(pizza11);
    addPizza(pizza12);
    addPizza(pizza13);
    addPizza(pizza14);
  }

  @Override
  public String toString() {
    return "Menu:" +
        pizzaMenu;
  }

  public void addPizza(Pizza pizza) {
    this.pizzaMenu.add(pizza);
  }

  public ArrayList getPizzamenu() {
    return pizzaMenu;
  }

  public Pizza getPizza(int number){
    Pizza pizza = null;
    for(int x = 0; x< pizzaMenu.size(); x++){
      if(number == pizzaMenu.get(x).getNumber()){
        pizza = pizzaMenu.get(x);
      }
    } return pizza;
  }
}
