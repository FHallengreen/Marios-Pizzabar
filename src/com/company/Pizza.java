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
    String text = "\u001B[1m " + number  + ".\t\t " +  name + "\t\t \033[0m" + ingredients + "\t\t\t\t" + price + ",-" + "\n ";
  return text;
  }



}
