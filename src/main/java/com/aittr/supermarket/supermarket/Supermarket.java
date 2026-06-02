package com.aittr.supermarket.supermarket;

import java.util.ArrayList;

public class Supermarket {
    private  String name;
    private String address;
    private ArrayList<Product> stock =
         new    ArrayList<>();


    public Supermarket(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null);
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (name != null);
        this.address = address;
    }

    public void addProduct(Product p,double quantity){

    }
}
