package com.shop.people;

public class Buyer {
    private double totalSumInWallet;
   // double price = Weapon.getPrice();

    public Buyer(double totalSumInWallet) {
        this.totalSumInWallet = totalSumInWallet;
    }

    public double getTotalSumInWallet() {
        return totalSumInWallet;
    }

    //TODO: cart with shopping items (map?)


}
