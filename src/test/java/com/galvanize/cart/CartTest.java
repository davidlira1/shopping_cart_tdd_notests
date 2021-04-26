package com.galvanize.cart;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

//    @Test
//    public void createAShoppingCart_doesShoppingCartExist() {
//        //SETUP
//        Cart cart = new Cart();
//        ArrayList<Item> expected = new ArrayList<Item>();
//
//        //EXECUTION
//        ArrayList<Item> actual = cart.shoppingCart;
//
//        //ASSERT
//        assertEquals(actual, expected, "shopping cart exist");
//    }
//
//    @Test
//    public void createAShoppingCart_initializedEmpty () {
//        //SETUP
//        Cart cart = new Cart();
//        int expected = 0;
//
//        //EXECUTION
//        int actual = cart.shoppingCart.size();
//
//        //ASSERT
//        assertEquals(expected, actual, "Expect cart to be empty when cart is initialized");
//    }

//    @Test
//    public void createAnItem_doesPriceExist() {
//        //SETUP
//        Item item = new Item(9.75);
//
//        //EXECUTION
////        boolean actual = Double.class.isInstance(item.price);
//        String actual = item.price.getType();
//
//        //ASSERT
//        assertTrue(actual, "field of price for item exists");
//    }
    @Test
    public void createAnItem_initializedWithName() {
        //SETUP
        Item item = new Item("oranges", 5.25);
        String expected = "oranges";

        //EXECUTION
        String actual = item.getName();

        //ASSERT
        assertEquals(expected, actual, "item is initialized with name");
    }


    @Test
    public void createAnItem_initializedWithPrice() {
        //SETUP
        Item item = new Item("oranges", 5.25);
        double expected = 5.25;

        //EXECUTION
        double actual = item.getPrice();

        //ASSERT
        assertEquals(expected, actual, "item is initialized with price");
    }

    @Test
    public void getTotalPrice_noItems() {
        //SETUP
        Cart cart = new Cart();
        String expected = "0.0 0";

        //EXECUTION
        String actual = cart.getTotalPrice();

        //ASSERT
        assertEquals(expected, actual, "Expect total price to be 0 when there are no items in shopping cart.");
    }

    @Test
    public void createGetTotalPrice() {
        //SETUP
        Cart cart = new Cart();
        Item item = new Item("oranges",5.25);
        cart.shoppingCart.add(item);
        String expected = "5.25 1";

        //EXECUTION
        String actual = cart.getTotalPrice();

        //ASSERT
        assertEquals(expected, actual, "Grabs total price of items in cart");
    }


    @Test
    public void itemizedList() {
        //SETUP
        Cart cart = new Cart();
        Item item = new Item("oranges",3.75);
        cart.shoppingCart.add(item);
        ArrayList<Item> expected = new ArrayList<Item>();
        expected.add(item);

        //EXECUTION
        ArrayList<Item> actual = cart.itemizedList();

        //ASSERT
        assertEquals(expected, actual, "Returns an itemized list with their name and price");
    }

    @Test
    public void getTotalPrice_multipleItems() {
        //SETUP
        Cart cart = new Cart();
        Item item1 = new Item("oranges", 3.25);
        Item item2 = new Item("apples", 6.24);
        cart.shoppingCart.add(item1);
        cart.shoppingCart.add(item2);
        String totalPrice = "9.49";
        String quantity = "2";
        String expected = totalPrice + " " + quantity;

        //EXECUTION
        String actual = cart.getTotalPrice();

        //ASSERT
        assertEquals(expected, actual, "GetTotalPrice reflects both item price and quantity");
    }

    @Test
    public void itemQuantities_noItems() {
        //setup
        Cart cart = new Cart();
        int expected = 0;

        //execution
        int actual = cart.itemQuantities();

        //assert
        assertEquals(expected, actual, "itemQuantities() returns 0 when there are not items in shopping cart");
    }

    @Test
    public void itemQuantities_multipleItems() {
        //setup
        Cart cart = new Cart();
        Item item1 = new Item("oranges", 3.25);
        Item item2 = new Item("apples", 6.24);
        cart.shoppingCart.add(item1);
        cart.shoppingCart.add(item2);
        int expected = 2;

        //execution
        int actual = cart.itemQuantities();

        //assert
        assertEquals(expected, actual, "itemQuantities() returns quantity of items in shopping cart");
    }



}