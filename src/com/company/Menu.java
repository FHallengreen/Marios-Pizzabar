package com.company;

import java.util.ArrayList;

public class Menu {

        Menu menu = new Menu();
        ArrayList pizzamenu = new ArrayList();
        Pizza pizza = new Pizza(1, "Vesuvio","Lækker",44);

        public void addPizza(Pizza pizza){
                this.pizzamenu.add(pizza);
        }


        }
