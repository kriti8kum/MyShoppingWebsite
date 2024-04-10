package com.myweb.MyWeb.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

public class Order {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    UUID id;
    int totalPrice;
    int totalQunantity;
    @ManyToOne
    Users users;
    @OneToMany
    List<Product> products;

}
