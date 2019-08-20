package com.shop.weapons;

import java.util.ArrayList;
import java.util.List;

public class WeaponLists {
    //create a Pistol List
    public static List<Pistol> createPistolList() {
        ArrayList<Pistol> pistolList = new ArrayList<Pistol>();
        pistolList.add(new Pistol("Beretta", 32));
        pistolList.add(new Pistol("Glock", 67));
        pistolList.add(new Pistol("Walther PPK", 106));

        System.out.println("We can offer you the following models: " + pistolList.toString());
        System.out.println("Would you like to test any of these?");
        return pistolList;
    }

    //create a Revolver List
    public static List<Revolver> createRevolverList() {
        ArrayList<Revolver> revolverList = new ArrayList<Revolver>();
        revolverList.add(new Revolver("Ruger", 60.6));
        revolverList.add(new Revolver("S&W", 234.76));
        revolverList.add(new Revolver("Colt", 554.98));

        System.out.println("We can offer you the following models: " + revolverList.toString());
        System.out.println("Would you like to test any of these?");
        return revolverList;
    }

    //create a Shotgun List
    public static List<Shotgun> createShotgunList() {
        ArrayList<Shotgun> shotgunList = new ArrayList<Shotgun>();
        shotgunList.add(new Shotgun("Winchester", 457.83));
        shotgunList.add(new Shotgun("Remington", 693.24));
        shotgunList.add(new Shotgun("Mossberg", 357.73));

        System.out.println("We can offer you the following models: " + shotgunList.toString());
        System.out.println("Would you like to test any of these?");
        return shotgunList;
    }

    //create a Rifle List
    public static List<AutomaticRifle> createRifleList() {
        ArrayList<AutomaticRifle> automaticRiflesList = new ArrayList<AutomaticRifle>();
        automaticRiflesList.add(new AutomaticRifle("Winchester", 457.83));
        automaticRiflesList.add(new AutomaticRifle("Remington", 693.24));
        automaticRiflesList.add(new AutomaticRifle("Mossberg", 357.73));

        System.out.println("We can offer you the following models: " + automaticRiflesList.toString());
        System.out.println("Would you like to test any of these?");
        return automaticRiflesList;
    }

    //create a sword List
    public static List<Sword> createSwordList() {
        ArrayList<Sword> swordList = new ArrayList<Sword>();
        swordList.add(new Sword("Katana", 899.0));
        swordList.add(new Sword("Odachi", 1200.34));
        swordList.add(new Sword("Wakizashi", 756.94));

        System.out.println("We can offer you the following models: " + swordList.toString());
        System.out.println("Would you like to test any of these?");
        return swordList;
    }

    //create a sabre List
    public static List<Sabre> createSabreList() {
        ArrayList<Sabre> sabreList = new ArrayList<Sabre>();
        sabreList.add(new Sabre("Polish Hussar Sabre", 809.0));
        sabreList.add(new Sabre("Excalibur Sabre", 127.45));

        System.out.println("We can offer you the following models: " + sabreList.toString());
        System.out.println("Would you like to test any of these?");
        return sabreList;
    }

    //create a dagger List
    public static List<Dagger> createDaggerList() {
        ArrayList<Dagger> daggerList = new ArrayList<Dagger>();
        daggerList.add(new Dagger("Kortik", 204.0));
        daggerList.add(new Dagger("Swiss Army dagger", 158.34));

        System.out.println("We can offer you the following models: " + daggerList.toString());
        System.out.println("Would you like to test any of these?");
        return daggerList;
    }
}
