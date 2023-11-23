package com.capg.pizzapp.ServiceImpl;

import com.capg.pizzapp.Entity.Cart;
import com.capg.pizzapp.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceImpl implements CartService {
    @Autowired
    @Override
    public Cart createCart(Cart cart, int userId) {
        return null;
    }

    @Override
    public Cart getCart(int cartId) {
        return null;
    }
}
