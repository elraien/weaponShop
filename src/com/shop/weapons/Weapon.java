package com.shop.weapons;

import com.shop.api.Buyable;
import com.shop.api.Testable;

public abstract class Weapon implements Buyable, Testable {
    double price;
    String model;

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Model: " + this.model +" price: " + this.price;
    }


}
