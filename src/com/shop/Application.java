package com.shop;

import com.shop.people.Buyer;
import com.shop.weapons.WeaponLists;

import java.util.Scanner;

public class Application {

    public static void greetBuyer() {
        System.out.println("Hello and welcome to our weapon shop.");
        System.out.println("Please press 1 for firearms or press 2 for cold steel weapons.");
        System.out.println("Press 3 to exit");
    }

    public static int getUserChoice(){
        Scanner scanner = new Scanner(System.in);
        int chosenCategory = scanner.nextInt();
        return chosenCategory;
    }

    public static int categoryHandler(int chosenCategory) {
        if (chosenCategory == 1) {
            System.out.println("Press 1 for pistols");
            System.out.println("Press 2 for revolvers");
            System.out.println("Press 3 for shotguns");
            System.out.println("Press 4 for automatic rifles");
        } else if (chosenCategory == 2) {
            System.out.println("Press 5 for swords");
            System.out.println("Press 6 for sabres");
            System.out.println("Press 7 for daggers");
        } else if (chosenCategory == 3) {
            System.out.println("Have a great day and come back soon!");
        } else {
            System.out.println("Invalid input");//add exception here
        }
        return chosenCategory;
    }

    public static String chooseWeapon() {
        Scanner scanner = new Scanner(System.in);
        String chosenWeapon = scanner.nextLine();
        System.out.println("Yes, I would like to test " + chosenWeapon);
        return chosenWeapon;
    }

    public static void testChosenWeapon(int chosenCategory) {
        if (chosenCategory == 1) {
            //Firearms.testWeapon();
            System.out.println("Testing weaponBang! Bang! This firearm has been tested.");
        } else if (chosenCategory == 2) {
            System.out.println("Testing weapon..... This cold steel weapon is sharp.");
        }
    }

    public static void subcategoryHandler(int chosenCategory) {
        Scanner scanner = new Scanner(System.in);
        int chosenSubcategory = scanner.nextInt();
        switch (chosenSubcategory) {
            case (1):
                WeaponLists.createPistolList();
                break;
            case (2):
                WeaponLists.createRevolverList();
                break;
            case (3):
                WeaponLists.createShotgunList();
                break;
            case (4):
                WeaponLists.createRifleList();
                break;
            case (5):
                WeaponLists.createSwordList();
                break;
            case (6):
                WeaponLists.createSabreList();
                break;
            case (7):
                WeaponLists.createDaggerList();
                break;
        }
        chooseWeapon();
        testChosenWeapon(chosenCategory);
    }

//    public static double getWeaponPrice(){
//        double weaponPrice;
//
//        return weaponPrice;
//    }

    public static void buyWeapon(){
        System.out.println("Would you like to purchase this weapon? Press 1 for yes or 2 for no");
        int buyWeapon = getUserChoice();
        if (buyWeapon == 1) {
            System.out.println("It will cost you smth??");//get price of an item
            Buyer buyer = new Buyer(200);
            double sumInWallet = buyer.getTotalSumInWallet();
           // buyer.payForWeapon();
        }
    }

    public static void main(String[] args) {
        greetBuyer();
        subcategoryHandler(categoryHandler(getUserChoice()));
    }
}
