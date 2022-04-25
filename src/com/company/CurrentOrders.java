package com.company;

import java.util.ArrayList;
import java.util.*;

public class CurrentOrders {

  protected ArrayList<Order> currentOrders = new ArrayList<>();

  public CurrentOrders(){
  }

  public ArrayList<Order> getCurrentOrders() {
    return currentOrders;
  }

  public void addOrder(Order order){
    currentOrders.add(order);
  }

  public String showCurrentOrders(){
    String orders = "";
    String preorders = "";
    Collections.sort(currentOrders, Comparator.comparingInt(Order::getTime)); //sorting current orders by Time
    for(int x = 0; x<currentOrders.size();x++) {
      String time = Integer.toString(currentOrders.get(x).getTime());
      String hours;
      String minutes;
      if(time.length() == 3) {
        hours = time.substring(0, 1);
        minutes = time.substring(1, 3);
        preorders += "Order: " + currentOrders.get(x).getOrderNumber() + " │ " + currentOrders.get(x).getFullOrder() + " | Pickup Time: " + hours + ":" + minutes + "\n";
      } else if (time.length() == 4){
        hours = time.substring(0, 2);
        minutes = time.substring(2, 4);
        preorders += "Order: " + currentOrders.get(x).getOrderNumber() + " │ " + currentOrders.get(x).getFullOrder() + " | Pickup Time: " + hours + ":" + minutes + "\n";
      } else
      orders += "Order: " + currentOrders.get(x).getOrderNumber() + " │ " + currentOrders.get(x).getFullOrder() + "\n";

    }if(orders.equals("")){
      orders = "There are no ongoing Orders\n";
    }return orders + "_________________________\n\n" + preorders;
  }
}
