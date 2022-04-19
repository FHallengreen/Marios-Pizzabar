package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Engine {
  Scanner sc = new Scanner(System.in);
  Music music = new Music();
  Ui ui = new Ui();
  Menu menu = new Menu();
  CurrentOrders cO = new CurrentOrders();

  public void createOrder(){
    boolean runOrder = true;
    int orderNumber = 1;
    Order order = new Order(orderNumber);
    while (runOrder){
      System.out.println(order);
      System.out.println("Type 1. 2. 3. or 9.");
      String choice = sc.nextLine();
      switch(choice) {
        case "1" -> {
          System.out.println("Enter Pizza number:");
          int number = sc.nextInt();
          order.addPizzaToOrder(menu.getPizza(number));
          System.out.println("Add Pizza to Order");
        }
        case "2" -> System.out.println("Delete Pizza from Order");
        case "3" -> System.out.println("Cancel order");
        case "9" -> {
          orderNumber++;
          runOrder = false;
          cO.addOrder(order);
          System.out.println("Finish Order");
       }
      }
    }
  }

  public void execute() throws InterruptedException {

    System.out.println((Arrays.toString(menu.pizzaMenu.toArray()).replace(" , ","").replace("]","")));
    //music.pizzatime(); //TODO Play dat funky music!!
    boolean run = true;
    while (run) {
      switch (sc.nextLine()) {
        case "1" -> System.out.println(menu.pizzaMenu);
        case "2" -> {
          System.out.println("Creating new order");
          createOrder();
          }
        case "3" -> System.out.println(cO.getCurrentOrders());
        case "4" -> System.out.println("Archive menu");
        case "5" -> System.out.println("Check history");
        case "9" -> {
          System.out.println("Shutting down!");
          Thread.sleep(5000);
          run = false;
         }
    default -> System.out.println("Invalid input");
     }
    }
  }
}
