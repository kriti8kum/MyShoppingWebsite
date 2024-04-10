package com.myweb.MyWeb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.UUID;

@Entity
public class Student {
    @Id
    UUID id;
    String name;


}
