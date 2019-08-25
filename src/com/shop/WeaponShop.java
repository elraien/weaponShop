package com.shop;

import com.shop.weapons.*;

import java.util.ArrayList;

public class WeaponShop {


    public ArrayList addWeapons() {
        ArrayList<Weapon> weaponList = new ArrayList<>();
        weaponList.add(new Pistol("Beretta", 32));
        weaponList.add(new Pistol("Glock", 67));
        weaponList.add(new Pistol("Walther", 106));

        weaponList.add(new Revolver("Ruger", 60.6));
        weaponList.add(new Revolver("S&W", 234.76));
        weaponList.add(new Revolver("Colt", 554.98));

        weaponList.add(new Shotgun("Winchester", 457.83));
        weaponList.add(new Shotgun("Remington", 693.24));
        weaponList.add(new Shotgun("Mossberg", 357.73));

        weaponList.add(new AutomaticRifle("AK", 789.43));
        weaponList.add(new AutomaticRifle("H&K ", 476.26));
        weaponList.add(new AutomaticRifle("M16", 357.73));

        weaponList.add(new Sword("Katana", 899.0));
        weaponList.add(new Sword("Odachi", 1200.34));
        weaponList.add(new Sword("Wakizashi", 756.94));

        weaponList.add(new Sabre("Polish Hussar Sabre", 809.0));
        weaponList.add(new Sabre("Excalibur Sabre", 127.45));

        weaponList.add(new Dagger("Kortik", 204.0));
        weaponList.add(new Dagger("Swiss Army dagger", 158.34));

 //       int index = 0;
//        for (Weapon s : weaponList)
//            System.out.println((index++) + ": " + s);
        //System.out.println(weapons.indexOf("S&W"));
        return weaponList;

    }


}

