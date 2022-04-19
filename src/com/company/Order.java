package com.company;

import java.util.ArrayList;

public class Order {

  ArrayList<Pizza> order = new ArrayList<>();
  int orderNumber;

  public Order(int orderNumber){
    this.orderNumber = orderNumber;
  }

  public void addPizzaToOrder(Pizza pizza){
    order.add(pizza);
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
    for(int x = 0; x<order.size();x++){
      return order.get(x).getNumber() + ":" + order.get(x).getName();
    }
    return "*";
  }
}
