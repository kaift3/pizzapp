package com.capg.pizzapp.Entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "user_info")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//to auto generate the id
    private int userId;
    private String userName;
    private String userPassword;
    private String userAddress;
    private String userPhoneNumber;
    private boolean isAdmin;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Cart cart;



}
