package com.example.cartdemo.controller;

import com.example.cartdemo.entity.CartItem;
import com.example.cartdemo.entity.Product;
import com.example.cartdemo.entity.ShoppingCartAction;

import java.util.ArrayList;

public class ShoppingCartController implements ShoppingCartAction {
    @Override
    public void add(Product product, int quantity) {

    }

    @Override
    public void update(Product product, int quantity) {

    }

    @Override
    public void remove(Product product) {

    }

    @Override
    public ArrayList<CartItem> getListItems() {
        return null;
    }
}
