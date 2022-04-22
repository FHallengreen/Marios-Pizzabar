package com.company;

public class Pizza {
  private String number;
  private String name;
  private String ingredients;
  private int price;

  public Pizza(String number, String name, String ingredients, int price) {
    this.number = number;
    this.name = name;
    this.ingredients = ingredients;
    this.price = price;
  }

  public String getNumber(){
    return number;
  }

  public String getName(){
    return name;
  }

  public int getPrice(){
    return price;
  }

  @Override
  public String toString() {
    String text = " \u001B[1m" + String.format("%2s.%-20s", number, name) + "\033[0m" + ingredients + "\t-\t" +  price + " DKK\n";
  return text;
  }



}
