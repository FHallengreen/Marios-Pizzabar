package com.company;

public class Ui {
  Menu menu = new Menu();



  public String mainMenu(){
    String mainMenu = "╔═══════════════════════════╗\n"+
    "║ 1. Menu                   ║\n"+
    "║ 2. Create new order       ║\n"+
    "║ 3. Payment / Close order  ║\n"+
    "║ 4. Archived orders        ║\n"+
    "║ 5. Check lost revenue     ║\n"+
    "║ 0. Shutdown               ║\n"+
    "╚═══════════════════════════╝";
    return mainMenu;
  }

  public String newPage(){
    return "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
  }

  public String orderMenu(){
    String orderMenu = "╔════════════════════════════╗\n"+
                       "║ 1. Add Pizza to order      ║\n"+
                       "║ 2. Delete Pizza from order ║\n"+
                       "║ 3. Delete Entire Order     ║\n"+
                       "║ 0. Finish Order            ║\n"+
                       "╚════════════════════════════╝";
    return orderMenu;
  }

  public String paymentMenu(){
    String paymentMenu = "╔════════════════════════════╗\n"+
        "║ 1. Archive order           ║\n"+
        "║ 2. Delete order            ║\n"+
        "║ 0. Go back                 ║\n"+
        "╚════════════════════════════╝";
  return paymentMenu;
  }

}

