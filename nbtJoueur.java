package com.company;

import java.util.Scanner;

public class nbtJoueur {
   //fonction pseudo
    public static String pseudo(){
        Scanner scanner = new Scanner(System.in);
        String pseudo;
        pseudo = scanner.next();
        return pseudo;
    }
    //fonction pion
    public static String pion(){
        Scanner scanner = new Scanner(System.in);
        String pion;
        pion = scanner.next();
        return pion;
    }
}
