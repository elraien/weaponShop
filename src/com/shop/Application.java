package com.shop;

import com.shop.people.Buyer;
import com.shop.weapons.Weapon;

import java.util.ArrayList;
import java.util.Scanner;
public class Application {

    public static ArrayList openTheShop() {
        WeaponShop shop = new WeaponShop();
        ArrayList<Weapon> newShopItems = shop.addWeapons(); //putting weapons on the shelves
        return newShopItems;
    }

    public static void greetBuyer() {
        System.out.println("Hello and welcome to our weapon shop!");
        System.out.println("Press 1 to choose firearms");
        System.out.println("Press 2 to choose cold steel weapons");
        System.out.println("Press 3 to exit");
    }

    public static int getUserChoice() {
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

    public static int chooseWeapon() {
        System.out.println("Enter ID number of a weapon if you would like to test it:");
        Scanner scanner = new Scanner(System.in);
        int chosenWeapon = scanner.nextInt();
        System.out.println("Yes, I would like to test " + chosenWeapon);
        return chosenWeapon;
    }




    public static void testChosenWeapon(int chosenWeapon) {
        if (chosenWeapon < 15) {
            //Firearms.testWeapon();
            System.out.println("Testing weapon...Bang! Bang! This firearm has been tested.");
        } else {
            System.out.println("Testing weapon..... This cold steel weapon is sharp.");
        }
    }

    public static void printList(ArrayList<Weapon> weapons) {
        Scanner scanner = new Scanner(System.in);
        int chosenSubcategory = scanner.nextInt();

        if (chosenSubcategory == 1)
            for (int i = 0; i < 3; i++)
                System.out.println("ID: " + (i + 1) + " " + weapons.get(i));
        if (chosenSubcategory == 2)
            for (int i = 3; i < 6; i++)
                System.out.println("ID: " + (i + 1) + " " + weapons.get(i));
        if (chosenSubcategory == 3)
            for (int i = 6; i < 9; i++)
                System.out.println("ID: " + (i + 1) + " " + weapons.get(i));
        if (chosenSubcategory == 4)
            for (int i = 9; i < 12; i++)
                System.out.println("ID: " + (i + 1) + " " + weapons.get(i));
        if (chosenSubcategory == 5)
            for (int i = 12; i < 15; i++)
                System.out.println("ID: " + (i + 1) + " " + weapons.get(i));
        if (chosenSubcategory == 6)
            for (int i = 15; i < 17; i++)
                System.out.println("ID: " + (i + 1) + " " + weapons.get(i));
        if (chosenSubcategory == 7)
            for (int i = 17; i < 19; i++)
                System.out.println("ID: " + (i + 1) + " " + weapons.get(i));

    }

    public static double getWeaponPrice(int chosenWeapon, ArrayList<Weapon> weapons) {
        int indexOfChosenWeapon = chosenWeapon - 1;
        double price = weapons.get(indexOfChosenWeapon).getPrice();
        return price;
    }

    public static double offerToBuy(int chosenWeapon, ArrayList<Weapon> weapons){
        double price = getWeaponPrice(chosenWeapon, weapons);
        System.out.println("Would you like to purchase this weapon? Press 1 for yes or 2 for no");
        int buyWeapon = getUserChoice();
        if (buyWeapon == 1) {
            System.out.println("You have to pay " + price);
        } else {
            System.out.println("Think again :) ");
        }
        return price;
    }

    public static double buyWeapon(double price){
        Buyer buyer = new Buyer(200);
        double sumInWallet = buyer.getTotalSumInWallet();
        if (sumInWallet < price) {
            System.out.println("You don't have enough money");
        } else {
            sumInWallet -= price;
            System.out.println("Balance in your wallet: " + sumInWallet);

            }
        return sumInWallet;
    }

    private static void removeWeaponFromShelf(ArrayList<Weapon> weapons, int index) {
        weapons.remove(index);
    }


    public static void main(String[] args) {

        ArrayList<Weapon> shopItems = openTheShop();
        greetBuyer();
        categoryHandler(getUserChoice());
        printList(shopItems);

        int chosenWeapon = chooseWeapon();
        testChosenWeapon(chosenWeapon);

        buyWeapon(offerToBuy(chosenWeapon, shopItems));
        removeWeaponFromShelf(shopItems,chosenWeapon-1 );
        System.out.println(shopItems);
    }
}
