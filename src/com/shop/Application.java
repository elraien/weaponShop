package com.shop;

import com.shop.weapons.Pistol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {


    public static void greetBuyer() {
        System.out.println("Hello and welcome to our weapon shop.");
        System.out.println("Please press 1 for firearms or press 2 for cold steel weapons.");
        System.out.println("Press 3 to exit");
    }

    public static int categoryHandler() {
        Scanner scanner = new Scanner(System.in);
        int chosenCategory = scanner.nextInt();
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

    public static List<Pistol> createPistolList() {
        ArrayList<Pistol> pistolList = new ArrayList<Pistol>();
        pistolList.add(new Pistol("Beretta", 32));
        pistolList.add(new Pistol("Glock", 67));
        pistolList.add(new Pistol("Walther PPK", 106));
        pistolList.add(new Pistol("Walther P99", 98));
        System.out.println(pistolList.toString());
        return pistolList;
    }


    public static void subcategoryHandler() {
        Scanner scanner = new Scanner(System.in);
        int chosenSubcategory = scanner.nextInt();
        switch (chosenSubcategory) {
            case (1):
                createPistolList();
        }
    }

    public static void main(String[] args) {
        greetBuyer();
        categoryHandler();
        subcategoryHandler();
    }
}
