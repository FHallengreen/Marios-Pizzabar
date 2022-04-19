package com.company;

import java.util.ArrayList;

public class Menu {
  ArrayList pizzamenu = new ArrayList();

  public void createMenu() {
    addPizza(new Pizza(1, "Vesuvio", "Tomatsauce, ost, skinke & oregano.", 57));
    addPizza(new Pizza(2, "Amerikaner", "Tomatsauce, ost, oksefars & oregano.", 53));
    addPizza(new Pizza(3, "Cacciatore", "Tomatsauce, ost, pepperoni & oregano.", 57));
    addPizza(new Pizza(4,"Carbona","Tomatsauce, ost, kødsauce, spaghetti, cocktailpølser & oregano", 63));
    addPizza(new Pizza(5,"Dennis","Tomatsauce, ost, skinke, pepperoni, cocktailpølser & oregano.", 65));
    addPizza(new Pizza(6,"Bertil","Tomatsauce, ost, bacon & oregano.", 57));
    addPizza(new Pizza(7,"Silvia","Tomatsauce, ost, pepperoni, rød peber, løg, oliven & oregano.", 61));
    addPizza(new Pizza(8,"Victoria","Tomatsauce, ost, skinke, ananas, champignon, løg & oregano.", 61));
    addPizza(new Pizza(9,"Toronfo","Tomatsauce, ost, skinke, bacon, kebab, chili & oregano.", 61));
    addPizza(new Pizza(10,"Capricciosa","Tomatsauce, ost, skinke, champignon & oregano.", 61));
    addPizza(new Pizza(11,"Hawaii","Tomatsauce, ost, skinke, ananas & oregano.", 61));
    addPizza(new Pizza(12,"Le Blissola","Tomatsauce, ost, skinke, rejer & oregano.", 61));
    addPizza(new Pizza(13,"Venezia","Tomatsauce, ost, bacon & oregano.", 61));
    addPizza(new Pizza(14,"Mafia","Tomatsauce, ost, pepperoni, bacon, løg & oregano.", 61));

  }

  @Override
  public String toString() {
    return "Menu:" +
        pizzamenu;
  }

  public void addPizza(Pizza pizza) {
    this.pizzamenu.add(pizza);
  }
}
