package com.shop.weapons;

public class Pistol extends Firearms {
  String model;

    public Pistol(String model, int price) {
        this.model = model;
        super.price = price;
    }

    @Override
    public String toString() {
        return "Model: " + this.model +" price: " + this.price;
    }
}
