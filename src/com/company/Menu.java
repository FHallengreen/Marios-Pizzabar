package com.company;

import java.util.ArrayList;

public class Menu {
  ArrayList pizzamenu = new ArrayList();

  public void createMenu() {
    addPizza(new Pizza(1, "Vesuvio", "Tekst1", 57));
    addPizza(new Pizza(2, "Amerikaner", "Tekst2", 53));
    addPizza(new Pizza(3, "Cacciatore", "Tomatsauce, ost, pepperoni & oregano", 57));
    addPizza(new Pizza(4,"Carbona","Tomatsauce, ost, kødsauce, spaghetti, cocktailpølser & oregano", 63));
    addPizza(new Pizza(5,"Dennis","???", 65));
    addPizza(new Pizza(6,"Bertil","???", 57));
    addPizza(new Pizza(7,"Silvia","???", 61));
    addPizza(new Pizza(8,"Victoria","???", 61));
    addPizza(new Pizza(9,"Toronfo","???", 61));
    addPizza(new Pizza(10,"Capricciosa","???", 61));
    addPizza(new Pizza(11,"Hawaii","???", 61));
    addPizza(new Pizza(12,"Le Blissola","???", 61));
    addPizza(new Pizza(13,"Venezia","???", 61));
    addPizza(new Pizza(14,"Mafia","???", 61));

  }

  public void addPizza(Pizza pizza) {
    this.pizzamenu.add(pizza);
  }
}
