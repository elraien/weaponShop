package com.shop.weapons;

import com.shop.api.Loadable;
import com.shop.api.Shootable;

public class Firearms extends Weapon implements Loadable, Shootable {


    @Override
    public void buy() {

    }

    @Override
    public void testWeapon() {
        System.out.println("testing firearm");
    }

    @Override
    public void loadWeapon() {

    }

    @Override
    public void shoot() {

    }

}
