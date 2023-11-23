package com.capg.pizzapp.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//to auto generate the id
    private int pizzaId;
    private String pizzaName;
    private String pizzaDescp;
    private String pizzaType;
//    @OneToMany(mappedBy = "pizza", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Toppings> pizzaToppings;
    @ManyToOne
    @JoinColumn(name = "cartId")
    private Cart cart;
    private double pizzaPrice;

}
