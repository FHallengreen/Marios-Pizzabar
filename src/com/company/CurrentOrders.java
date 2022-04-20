package com.company;

import java.util.ArrayList;

public class CurrentOrders {

  ArrayList<Order> currentOrders = new ArrayList<>();

  public CurrentOrders(){
  }

  public void addOrder(Order order){
    currentOrders.add(order);
  }

  public ArrayList<Order> getCurrentOrders() {
    return currentOrders;
  }

  public void showCurrentOrders(){
    for(int x = 0; x<currentOrders.size();x++) {
      System.out.println(currentOrders.get(x).getOrderNumber() + " " + currentOrders.get(x).getOrder() + "");
      }
  }
}
