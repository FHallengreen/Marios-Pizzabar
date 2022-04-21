package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Engine {
  Scanner sc = new Scanner(System.in);
  Music music = new Music();
  Ui ui = new Ui();
  Menu menu = new Menu();
  CurrentOrders cO = new CurrentOrders();
  int orderNumber = 1;
  Archive archive = new Archive();
//  Order order = new Order(orderNumber);

  public void createOrder() throws InterruptedException {
    boolean runOrder = true;
    Order order = new Order(orderNumber);
    while (runOrder) {
      System.out.println(ui.newPage());
      System.out.println("\n\n" + order.getFullOrder());
      System.out.println(ui.orderMenu());
      String choice = sc.nextLine();
      switch (choice) {
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
          System.out.println("Canceling order");
          Thread.sleep(2000);
          runOrder = false;
        }
        case "0" -> {
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

  private void archivedOrders() {
    System.out.println(archive.getArchivedPizzas());

  }

  private void payment() {
    System.out.println("Which order would you like to archive/cancel? - Type order number.");
    System.out.println("Type 0 to go back.");
    System.out.println(cO.showCurrentOrders());
    boolean noOrder = true;
    try {
      while (noOrder) {
        int whichOrderNumber = sc.nextInt();
        for (int i = 0; i < cO.getCurrentOrders().size(); i++) {
          if (whichOrderNumber == cO.getCurrentOrders().get(i).getOrderNumber()) {
            System.out.println(ui.paymentMenu());
            archiveOrPay(cO.currentOrders.get(i));
            noOrder = false;
          } else if (whichOrderNumber == 0) {
            noOrder = false;
          } else System.out.println("Not a valid order");
        }
      }
    } catch (InputMismatchException e) {
      System.out.print(e.getMessage() + "Invalid choice");
    }
  }

  private void archiveOrPay(Order orderNumber) {
    boolean whichOption = true;
    while (whichOption) {
      switch (sc.nextLine()) {
        case "1" -> {
          System.out.println("Archiving order nr. " + orderNumber.getFullOrder());
          for (int i = 0; i < cO.getCurrentOrders().size(); i++) {
            archive.getArchivedPizzas().add(orderNumber);
            cO.currentOrders.remove(orderNumber);
          }
        }
        case "2" -> System.out.println("Test2");
        case "0" -> whichOption = false;
      }
    }
  }


  public void execute() throws InterruptedException {

//    music.pizzatime(); //TODO Play dat funky music!!
    boolean run = true;
    while (run) {
      System.out.println(ui.newPage());
      System.out.println(ui.mainMenu());
      switch (sc.nextLine()) {
        case "1" -> {
          System.out.println(menu.getPizzamenu());
          System.out.println("\n\nPress ENTER to continue");
          sc.nextLine();
        }
        case "2" -> {
          System.out.println("Creating new order");
          createOrder();
        }
        case "3" -> {
          System.out.println(cO.showCurrentOrders());
          System.out.println("\n\nPress ENTER to continue");
          sc.nextLine();
        }
        case "4" -> {
          System.out.println("Payment / Close Order");
          payment();

          System.out.println("\n\nPress ENTER to go back");
//          sc.nextLine();
        }
        case "5" -> {
          System.out.println("Archived orders / revenue");
          archivedOrders();
          System.out.println("\n\nPress ENTER to go back");
          sc.nextLine();
        }
        case "6" -> {
          System.out.println("Check lost revenue");
          lostRevenue();
          System.out.println("\n\nPress ENTER to go back");
          sc.nextLine();
        }
        case "0" -> {
          System.out.println("Shutting down!");
          Thread.sleep(5000);
          run = false;
        }
        default -> System.out.println("Invalid input");
      }
    }
  }
}
