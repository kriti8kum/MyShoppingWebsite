package com.myweb.MyWeb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.util.UUID;
@Entity
public class Laptop {
    @Id
    UUID id;
    String name;
    @OneToOne
    Student student;
}
