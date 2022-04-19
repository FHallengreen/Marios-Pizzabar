package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Engine {
  Scanner sc = new Scanner(System.in);

  public void execute() {
    Music music = new Music();
    Ui ui = new Ui();
    Menu menu = new Menu();
    menu.createMenu();

//    music.pizzatime(); //TODO Play dat funky music!!
    System.out.println((Arrays.toString(menu.pizzamenu.toArray()).substring(1,1097).replace(" , ","").replace("]","")));

   while (true) {
    switch (sc.nextLine()) {
//    case "menu" -> System.out.println(menu.pizzamenu);
    }

    }
  }

}
