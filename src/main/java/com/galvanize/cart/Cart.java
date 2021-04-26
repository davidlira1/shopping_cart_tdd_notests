package com.galvanize.cart;

import java.util.ArrayList;

public class Cart {

    public ArrayList<Item> shoppingCart;

    public Cart() {
        shoppingCart = new ArrayList<Item>();
    }

    public String getTotalPrice() {
        double totalPrice = 0;

        for (int i = 0; i < shoppingCart.size(); i++) {
            totalPrice += shoppingCart.get(i).price;
        }

        return totalPrice + " " + shoppingCart.size();
    }

    public ArrayList<Item> itemizedList() {
        return shoppingCart;
    }

    public int itemQuantities() {
        return shoppingCart.size();
    }

    public ArrayList<Item> onSaleItems() {
        ArrayList<Item> itemsOnSale = new ArrayList<Item>();

        for(int i = 0; i < shoppingCart.size(); i++) {
            if(shoppingCart.get(i).sale == true) {
                itemsOnSale.add(shoppingCart.get(i));
            }
        }

        return itemsOnSale;
    }

}