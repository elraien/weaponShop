package com.shop.weapons;

import com.shop.api.Buyable;
import com.shop.api.Testable;

import java.util.ArrayList;

public abstract class Weapon implements Buyable, Testable {
    double price;
    String model;
    int idNumber;

    public int getIdNumber(ArrayList<Weapon> weapons) {
        idNumber = weapons.indexOf(this.model);
        return idNumber;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Model: " + this.model + " price: " + this.price;
    }


}
