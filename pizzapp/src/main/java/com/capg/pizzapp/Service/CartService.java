package com.capg.pizzapp.Service;

import com.capg.pizzapp.Entity.Cart;

public interface CartService {
    public Cart createCart(Cart cart, int userId);
    public Cart getCart(int cartId);
}
