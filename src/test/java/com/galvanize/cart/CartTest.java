package com.galvanize.cart;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {

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

}