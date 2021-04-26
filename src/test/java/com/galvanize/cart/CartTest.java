package com.galvanize.cart;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    @Test
    public void createAShoppingCart_doesShoppingCartExist() {
        //SETUP
        Cart cart = new Cart();
        ArrayList<Item> expected = new ArrayList<Item>();

        //EXECUTION
        ArrayList<Item> actual = cart.shoppingCart;

        //ASSERT
        assertEquals(actual, expected, "shopping cart exist");
    }

    @Test
    public void createAShoppingCart_initializedEmpty () {
        //SETUP
        Cart cart = new Cart();
        int expected = 0;

        //EXECUTION
        int actual = cart.shoppingCart.size();

        //ASSERT
        assertEquals(expected, actual, "Expect cart to be empty when cart is initialized");
    }

    @Test
    public void createAnItem_doesPriceExist() {
        //SETUP
        Item item = new Item();

        //EXECUTION
        boolean actual = item.price instanceof double;

        //ASSERT
        assertTrue(actual, "field of price for item exists");
    }
}