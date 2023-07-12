package com.booleanuk.core;

import java.util.HashMap;

public class Basket {

    private HashMap<Product, Integer> basket = new HashMap<>();


    public HashMap<Product, Integer> getBasket() {
        return basket;
    }

    public void add(Bagel bagel, int quantity) {
        basket.put(bagel,quantity);
    }
}