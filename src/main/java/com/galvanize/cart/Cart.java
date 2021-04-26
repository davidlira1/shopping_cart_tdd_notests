package com.galvanize.cart;

import java.util.ArrayList;

public class Cart {

    public ArrayList<Item> shoppingCart;

    public Cart() {
        shoppingCart = new ArrayList<Item>();
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (int i = 0; i < shoppingCart.size(); i++) {
            totalPrice += shoppingCart.get(i).price;
        }

        return totalPrice;
    }
}