package com.company;

import java.util.ArrayList;

public class Menu {
  ArrayList<Pizza> pizzaMenu = new ArrayList();

  public Menu() {
    pizzaMenu.add(new Pizza("1","Vesuvio", "\t Tomatsauce, ost, skinke & oregano.\t\t\t\t\t\t\t", 57));
    pizzaMenu.add(new Pizza("2","\t Amerikaner", "\t Tomatsauce, ost, oksefars & oregano.\t\t\t\t\t\t", 53));
    pizzaMenu.add(new Pizza("3","\t Cacciatore", "\t Tomatsauce, ost, pepperoni & oregano.\t\t\t\t\t\t", 57));
    pizzaMenu.add(new Pizza("4","\t Carbona","\t Tomatsauce, ost, kødsauce, spaghetti, cocktailpølser & oregano", 63));
    pizzaMenu.add(new Pizza("5","\t Dennis","\t\t Tomatsauce, ost, skinke, pepperoni, cocktailpølser & oregano.", 65));
    pizzaMenu.add(new Pizza("6","\t Bertil","\t\t Tomatsauce, ost, bacon & oregano.\t\t\t\t\t\t\t", 57));
    pizzaMenu.add(new Pizza("7","\t Silvia","\t\t Tomatsauce, ost, pepperoni, rød peber, løg, oliven & oregano.", 61));
    pizzaMenu.add(new Pizza("8","\t Victoria","\t Tomatsauce, ost, skinke, ananas, champignon, løg & oregano.", 61));
    pizzaMenu.add(new Pizza("9","\t Toronfo","\t Tomatsauce, ost, skinke, bacon, kebab, chili & oregano.\t", 61));
    pizzaMenu.add(new Pizza("10","Capricciosa","Tomatsauce, ost, skinke, champignon & oregano.\t\t\t\t", 61));
    pizzaMenu.add(new Pizza("11","Hawaii","\t\t Tomatsauce, ost, skinke, ananas & oregano.\t\t\t\t\t", 61));
    pizzaMenu.add(new Pizza("12","Le Blissola","Tomatsauce, ost, skinke, rejer & oregano.\t\t\t\t\t", 61));
    pizzaMenu.add(new Pizza("13","Venezia","\t Tomatsauce, ost, bacon & oregano.\t\t\t\t\t\t\t", 61));
    pizzaMenu.add(new Pizza("14","Mafia","\t\t Tomatsauce, ost, pepperoni, bacon, løg & oregano.\t\t\t", 61));
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
