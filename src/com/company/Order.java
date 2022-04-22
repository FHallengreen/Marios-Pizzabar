package com.company;

import java.util.ArrayList;

public class Order {

  ArrayList<Pizza> order = new ArrayList<>();
  int orderNumber;

  public Order(int orderNumber){
    this.orderNumber = orderNumber;
  }

  public void addPizzaToOrder(Pizza pizza) throws InterruptedException {
    if(pizza != null){
      order.add(pizza);
    }else {
      System.out.println("No pizza to be found under that Number!");
      Thread.sleep(2000);
    }
  }

  public void removePizzaFromOrder(Pizza pizza){
    order.remove(pizza);
  }

  public ArrayList<Pizza> getOrder() {
    return order;
  }

  public String getFullOrder(){
    String fullOrder = "[";
    for(int i = 0;i<order.size();i++){
      fullOrder += order.get(i).getNumber() + "." + order.get(i).getName() + " ";
    }if(order.size() == 0){
      return "";
    } else return fullOrder + "] ■ Price: " + getOrderPrice() + " kr.";
  }

  public int getOrderNumber(){
    return orderNumber;
  }

  public int getOrderPrice(){
    int totalPrice = 0;
    for(int i = 0; i<order.size();i++){
      totalPrice += order.get(i).getPrice();
    }return totalPrice;
  }

  public String toString(){
    for(int x = 0; x < order.size()+1;x++){
      return order.get(x).getNumber() + ":" + order.get(x).getName();
    }
    return "*";
  }
}
