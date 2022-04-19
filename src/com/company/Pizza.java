package com.company;

import java.util.Arrays;

public class Pizza {
  private int number;
  private String name;
  private String ingredients;
  private int price;

  public Pizza(int number, String name, String ingredients, int price) {
    this.number = number;
    this.name = name;
    this.ingredients = ingredients;
    this.price = price;
  }

  @Override
  public String toString() {
    String text = "\u001B[1m" + number  + ". " +  name + "\t\t \033[0m" + ingredients + "\t\t\t\t" + price + ",-" + "\n ";
  return text;
  }



}
