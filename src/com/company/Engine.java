package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Engine {
  Scanner sc = new Scanner(System.in);
  Music music = new Music();
  Ui ui = new Ui();
  Menu menu = new Menu();

  public void execute() {

    menu.createMenu();
    System.out.println((Arrays.toString(menu.pizzamenu.toArray()).replace(" , ","").replace("]","")));
//    music.pizzatime(); //TODO Play dat funky music!!
   while (true) {
    switch (sc.nextLine()) {
//    case "menu" -> System.out.println(menu.pizzamenu);
    }

    }
  }

}
