package com.galvanize.cart;

public class Item {
    public double price;
    public String name;
    public boolean sale;

    public Item(String name, double price, boolean sale) {
        this.name = name;
        this.price = price;
        this.sale = sale;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSale() {
        return sale;
    }
}
