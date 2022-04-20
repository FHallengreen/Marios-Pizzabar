package com.company;

import java.util.ArrayList;

public class Order {

  ArrayList<Pizza> order = new ArrayList<>();
  int orderNumber;

  public Order(int orderNumber){
    this.orderNumber = orderNumber;
  }

  public void addPizzaToOrder(Pizza pizza){
    if(pizza != null){
      order.add(pizza);
    }else System.out.println("No pizza to be found under that Number!");
  }

  public void removePizzaFromOrder(Pizza pizza){
    order.remove(pizza);
  }

  public ArrayList<Pizza> getOrder() {
    return order;
  }

  public int getOrderNumber(){
    return orderNumber;
  }

  public String toString(){
    for(int x = 0; x < order.size()+1;x++){
      return order.get(x).getNumber() + ":" + order.get(x).getName();
    }
    return "*";
  }
}
