package com.example.user.shoppingbasket;


import java.util.ArrayList;


/**
 * Created by user on 03/12/2017.
 */

public class shoppingBasket  {


   private ArrayList<String> basket;

   public shoppingBasket(){

       basket = new ArrayList<String>();

        }


    public void addItem(String item){
        basket.add(item);
    }

    public void removeItem(String item){
        basket.remove(item);
    }

    public void clearList(){
        basket.clear();
    }

    public ArrayList<String> getBasket() {
        return basket;
    }
}
