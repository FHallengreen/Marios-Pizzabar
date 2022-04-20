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

  public String showCurrentOrders(){
    String orders = "";
    for(int x = 0; x<currentOrders.size();x++) {
      orders += currentOrders.get(x).getOrderNumber() + "" + currentOrders.get(x).getFullOrder() + "\n";
    }return orders;
  }
}
