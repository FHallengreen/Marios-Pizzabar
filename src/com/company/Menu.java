package com.company;

import java.util.ArrayList;

public class Menu {
  ArrayList<Pizza> pizzaMenu = new ArrayList();

  public Menu() {
    pizzaMenu.add(new Pizza("1","Vesuvio", "Tomatsauce, ost, skinke & oregano", 57));
    pizzaMenu.add(new Pizza("2","Amerikaner", "Tomatsauce, ost, oksefars & oregano", 53));
    pizzaMenu.add(new Pizza("3","Cacciatore", "Tomatsauce, ost, pepperoni & oregano", 57));
    pizzaMenu.add(new Pizza("4","Carbona","Tomatsauce, ost, kødsauce, spaghetti, cocktailpølser & oregano", 63));
    pizzaMenu.add(new Pizza("5","Dennis","Tomatsauce, ost, skinke, pepperoni, cocktailpølser & oregano", 65));
    pizzaMenu.add(new Pizza("6","Bertil","Tomatsauce, ost, bacon & oregano", 57));
    pizzaMenu.add(new Pizza("7","Silvia","Tomatsauce, ost, pepperoni, rød peber, løg, oliven & oregano", 61));
    pizzaMenu.add(new Pizza("8","Victoria","Tomatsauce, ost, skinke, ananas, champignon, løg & oregano", 61));
    pizzaMenu.add(new Pizza("9","Toronfo","Tomatsauce, ost, skinke, bacon, kebab, chili & oregano", 61));
    pizzaMenu.add(new Pizza("10","Capricciosa","Tomatsauce, ost, skinke, champignon & oregano", 61));
    pizzaMenu.add(new Pizza("11","Hawaii","Tomatsauce, ost, skinke, ananas & oregano", 61));
    pizzaMenu.add(new Pizza("12","Le Blissola","Tomatsauce, ost, skinke, rejer & oregano", 61));
    pizzaMenu.add(new Pizza("13","Venezia","Tomatsauce, ost, bacon & oregano", 61));
    pizzaMenu.add(new Pizza("14","Mafia","Tomatsauce, ost, pepperoni, bacon, løg & oregano", 61));
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

  public Pizza getPizza(String number){
    Pizza pizza = null;
    for(int x = 0; x< pizzaMenu.size(); x++){
      if(number.equals(pizzaMenu.get(x).getNumber())){
        pizza = pizzaMenu.get(x);
      }
    } return pizza;
  }
}
