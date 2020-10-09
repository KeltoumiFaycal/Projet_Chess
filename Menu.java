package com.company;

import java.util.Scanner;

public class Menu {
    //interface du menu
    public static int menu(){

        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("\n\n                                                    ECRAN D'ACCEUIL :");
            System.out.println("                                                       1: JOUER ");
            System.out.println("                                                       2: REGLES ");
            System.out.println("                                                       q: QUTTER ");
            System.out.println("\nTapez ce dont vous avez besoin :");

            String joueur;
            joueur = scanner.next();

            boolean jouer = joueur.equals("1");
            boolean regles = joueur.equals("2");
            boolean quitter = joueur.equals("q");

            if( jouer == true ){
                return 1;
            }
            if( regles == true ){
                return 2;
            }
            if( quitter == true ){
                return 3;
            }
        }
    }
}



