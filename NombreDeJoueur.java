package com.company;

import java.util.Scanner;

public class NombreDeJoueur {

    public static int nbJoueurs() {
//PSEUDO + Nb joueurs
        boolean menuReload = false;
        int a = 0;
        while (menuReload== false) {
            String pseudo1, pseudo2, pseudo3, pseudo4;
            Scanner pseudo = new Scanner(System.in);
            String Joueur;
            System.out.println("Combien de personnes jouent: 2, 3, 4 ?");
            Joueur = pseudo.next();

            boolean deuxJ = Joueur.equals("2");
            boolean troisJ = Joueur.equals("3");
            boolean quatreJ = Joueur.equals("4");


            if (deuxJ == true) {
                menuReload = true;
                a = 2;
            }
            if (troisJ == true) {
               menuReload = true;
                a = 3;
            }
            if (quatreJ == true) {
                menuReload = true;
                a = 4;
            }
        }
        return a;
    }
}
