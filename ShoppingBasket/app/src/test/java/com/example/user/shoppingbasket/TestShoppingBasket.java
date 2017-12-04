package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/12/2017.
 */

public class TestShoppingBasket {

    shoppingBasket shoppingBasket;

    @Before
    public void setup(){

        shoppingBasket = new shoppingBasket();


    }

    @Test
    public void addItem(){
        String item = "eggs";
        shoppingBasket.addItem(item);
        assertEquals(1, shoppingBasket.getBasket().size());

    }

    @Test
    public void removeItem(){
        String item = "eggs";
        shoppingBasket.addItem(item);
        shoppingBasket.removeItem(item);
        assertEquals(0, shoppingBasket.getBasket().size());
    }

    @Test
    public void clearList(){
        String item1 = "eggs";
        String item2 = "milk";
        shoppingBasket.addItem(item1);
        shoppingBasket.addItem(item2);
        shoppingBasket.clearList();
        assertEquals(0, shoppingBasket.getBasket().size());

    }



}
