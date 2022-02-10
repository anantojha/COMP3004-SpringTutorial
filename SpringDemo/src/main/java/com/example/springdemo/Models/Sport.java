package com.example.springdemo.Models;

import java.io.Serializable;

public class Sport implements Serializable {

    int id;
    String name;

    public Sport(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
