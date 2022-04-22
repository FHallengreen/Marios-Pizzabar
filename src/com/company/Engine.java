package com.company;

import java.util.ArrayList;
import java.util.Arrays;
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
  private int lostRevenue = 0;

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

  private void lostRevenue(Order lostOrder) {
    lostRevenue += lostOrder.getOrderPrice();
  }

  private void archivedOrders() {
    int revenue = 0;
    if (archive.getArchivedPizzas().size() != 0){
      for (int i = 0; i < archive.getArchivedPizzas().size(); i++) {
        System.out.println("Order number " + archive.getArchivedPizzas().get(i).getOrderNumber() + " " + archive.getArchivedPizzas().get(i).getFullOrder());
        revenue += archive.getArchivedPizzas().get(i).getOrderPrice();
      }
        System.out.println("\n\u001B[1m" +"Total revenue: " + revenue + " DKK\033[0m");
      System.out.println("‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗");
    }
    else System.out.println("No orders archived");
  }

  private void payment() {
    System.out.println("Which order would you like to archive/cancel? - Type order number.");
    System.out.println("Type 0 to go back.");
    System.out.println(cO.showCurrentOrders());
    boolean noOrder = true;
    try {
      while (noOrder) {
        int whichOrderNumber = sc.nextInt();
        boolean check = false;
        if (whichOrderNumber == 0) {
          noOrder = false;
        } else for (int i = 0; i < cO.getCurrentOrders().size(); i++) {
          if (whichOrderNumber == cO.getCurrentOrders().get(i).getOrderNumber()) {
            check = true;
            System.out.println(ui.paymentMenu());
            archiveOrPay(cO.currentOrders.get(i));
            noOrder = false;
          }
        }
        if (check == false) System.out.println("Not a valid order");
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
          for (int i = 0; i < cO.getCurrentOrders().size(); i++) {
            archive.getArchivedPizzas().add(orderNumber);
            cO.currentOrders.remove(orderNumber);
            System.out.println("Archiving order nr. " + orderNumber.getOrderNumber() + orderNumber.getFullOrder());
            whichOption = false;
          }
        }
        case "2" -> {
          lostRevenue(orderNumber);
          cO.getCurrentOrders().remove(orderNumber);
          System.out.println("Order: " + orderNumber.orderNumber + " has been canceled.");
          System.out.println(orderNumber.getOrderPrice() + "DKK has been added to your Lost Revenue");
          whichOption = false;
        }
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
          System.out.println(Arrays.toString(menu.getPizzamenu().toArray()).replace("]","").replace(",  ", "").substring(2,1212));
          System.out.println("\n\nPress ENTER to continue");
          sc.nextLine();
        }
        case "2" -> {
          System.out.println(ui.newPage());
          System.out.println("Creating new order");
          createOrder();
        }
        case "3" -> {
          System.out.println(ui.newPage());
          System.out.println(cO.showCurrentOrders());
          System.out.println("\n\nPress ENTER to continue");
          sc.nextLine();
        }
        case "4" -> {
          System.out.println("Payment / Close Order");
          payment();

          System.out.println("\n\nPress ENTER to go back");
          sc.nextLine();
        }
        case "5" -> {
          System.out.println(ui.newPage());
          System.out.println("Archived orders / revenue");
          archivedOrders();
          System.out.println("\n\nPress ENTER to go back");
          sc.nextLine();
        }
        case "6" -> {
          System.out.println(ui.newPage());
          if (lostRevenue != 0){
          System.out.println("Total Lost Revenue: -" + lostRevenue + " DKK");
          System.out.println("‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗");
          }else System.out.println("Currently no lost revenue.");
          System.out.println("\n\nPress ENTER to go back");
          sc.nextLine();
        }
        case "0" -> {
          System.out.println(ui.newPage());
          System.out.println("Shutting down!");
          Thread.sleep(5000);
          run = false;
        }
        default -> System.out.println("Invalid input");
      }
    }
  }
}
