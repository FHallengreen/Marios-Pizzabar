package com.company;

import java.util.Scanner;

public class Engine {
  Scanner sc = new Scanner(System.in);
  Music music = new Music();
  Ui ui = new Ui();
  Menu menu = new Menu();
  CurrentOrders cO = new CurrentOrders();
  int orderNumber = 1;
  Archive archive = new Archive();

  public void newPage(){
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }

  public void mainMenu(){
    System.out.println("╔═══════════════════════════╗");
    System.out.println("║ 1. Menu                   ║");
    System.out.println("║ 2. Create new order       ║");
    System.out.println("║ 3. Show current orders    ║");
    System.out.println("║ 4. Archive order          ║");
    System.out.println("║ 5. Check lost revenue     ║");
    System.out.println("║ 6. Payment / Close order  ║");
    System.out.println("║ 0. Shutdown               ║");
    System.out.println("╚═══════════════════════════╝");
  }

  public void createOrder(){
    boolean runOrder = true;
    Order order = new Order(orderNumber);
    while (runOrder){
      newPage();
      System.out.println("\n\n" + order.getFullOrder());
      System.out.println("\nType 1. 2. 3. or 0.");
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

  private void archiveMenu() {

  }

  private void payment() {
        System.out.println("Which order would you like to archive/cancel?");

      }



  public void execute() throws InterruptedException {

    //System.out.println((Arrays.toString(menu.pizzaMenu.toArray()).replace(" , ","").replace("]","")));
    //music.pizzatime(); //TODO Play dat funky music!!
    boolean run = true;
    while (run) {
      newPage();
      mainMenu();
      switch (sc.nextLine()) {
        case "1" -> {
          newPage();
          System.out.println(menu.pizzaMenu);
          System.out.println("\n\nPress ENTER to go back");
          sc.nextLine();
        }
        case "2" -> {
          System.out.println("Creating new order");
          createOrder();
          }
        case "3" -> {
          System.out.println(cO.showCurrentOrders());
          System.out.println("\n\nPress ENTER to go back");
          sc.nextLine();
        }
        case "4" -> {
          System.out.println("Archive menu");
          archiveMenu();
          System.out.println("\n\nPress ENTER to go back");
          sc.nextLine();
        }
        case "5" -> {
          System.out.println("Check lost revenue");
          lostRevenue();
          System.out.println("\n\nPress ENTER to go back");
          sc.nextLine();
        }
        case "6" -> {
          System.out.println("Payment / Close Order");
          payment();
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
