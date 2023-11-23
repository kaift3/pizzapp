package com.capg.pizzapp.Service;

import com.capg.pizzapp.Entity.Pizza;
import com.capg.pizzapp.Entity.User;

public interface PizzaService {
    public Pizza createPizza(Pizza pizza);
    public Pizza getPizza(int pizzaId);
}
