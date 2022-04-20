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
  int orderNumber = 1;
  Archive archive = new Archive();

  public void createOrder(){
    boolean runOrder = true;
    Order order = new Order(orderNumber);
    while (runOrder){
      System.out.println("\n\n" + order.getOrder());
      System.out.println("\nType 1. 2. 3. or 9.");
      String choice = sc.nextLine();
      switch(choice) {
        case "1" -> {
          System.out.println("\n\nEnter Pizza number:");
          String number = sc.nextLine();
          order.addPizzaToOrder(menu.getPizza(number));
        }
        case "2" -> {
          System.out.println("Enter Pizza number you wish to delete:");
          String number = sc.nextLine();
          order.removePizzaFromOrder(menu.getPizza(number));
        }
        case "3" -> {
          System.out.println("Cancel order");
          runOrder = false;
        }
        case "9" -> {
          orderNumber++;
          runOrder = false;
          cO.addOrder(order);
          System.out.println("Finish Order");
       }
      }
    }
  }

  private void lostRevenue() {
    int lostRevenue = 0;
//    lostRevenue -= input.getPrice();
  }

  private void archiveMenu() {

  }

  private void payment() {
        System.out.println("Which order would you like to archive/cancel?");

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
        case "3" -> cO.showCurrentOrders();
        case "4" -> {
          System.out.println("Archive menu");
          archiveMenu();
        }
        case "5" -> {
          System.out.println("Check lost revenue");
          lostRevenue();
        }
        case "6" -> {
          System.out.println("Payment / Close Order");
          payment();
        }
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
