package com.company;

import java.util.Scanner;

public class Plateau {

    public static int AfficheMonTableau(int resultat) {

        if (resultat == 2) {
            Scanner scanner = new Scanner(System.in);
            String joueur;
            System.out.println("Joueur 1, donne-moi ton pseudo");
            String joueur1 = nbtJoueur.pseudo();
            System.out.println("maintenant, donne-moi ton pion");
            String pion1 = nbtJoueur.pion();
            Joueur joueurP1 = new Joueur(joueur1, pion1);
            joueurP1.showBalance();

            System.out.println("Joueur 2, donne-moi ton pseudo");
            String joueur2 = nbtJoueur.pseudo();
            System.out.println("maintenant, donne-moi ton pion");
            String pion2 = nbtJoueur.pion();
            Joueur joueurP2 = new Joueur(joueur2, pion2);
            joueurP2.showBalance();
            boolean affichagetab = false;
            boolean passeBoucle = false;
            boolean detruire = false;
            while (affichagetab == false) {
                while (passeBoucle == false) {
                    String[][] tableau = new String[13][12];
//i = COLONNES / j = LIGNES

                    int xPion1 = 6;
                    int yPion1 = 6;
                    int xPion2 = 6;
                    int yPion2 = 5;

                    for (int i = 0; i < (tableau.length - 1); i++) {
                        for (int j = 0; j < (tableau[0].length - 1); j++) {
                            tableau[i][j] = ("[ ]");
                            tableau[xPion1][yPion1] = ("[" + pion1 + "]");
                            tableau[xPion2][yPion2] = ("[" + pion2 + "]");
                            if (i == 0) {
                                tableau[i][j] = Integer.toString(j);
                            }
                            if (j == 0) {
                                tableau[i][j] = Integer.toString(i);
                            }

                            System.out.print(tableau[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    boolean reboucler = false;
                    while (true) {
                        while ( reboucler == false){
                        System.out.println(joueur1 + ", c'est à toi de jouer. ");
                        System.out.println("Choisis bien ton déplacemnt: ('Z';'Q';'S';'D')");
                        joueur = scanner.next();
                        boolean gauche = joueur.equalsIgnoreCase("q");
                        boolean droite = joueur.equalsIgnoreCase("d");
                        boolean haut = joueur.equalsIgnoreCase("z");
                        boolean bas = joueur.equalsIgnoreCase("s");

                        //avancer à gauche
                            if (gauche == true) {
                                if( (tableau[xPion1][yPion1 - 1] != tableau[xPion2][yPion2]) && yPion1 > 1){
                                    for (int i = 0; i < (tableau.length - 1); i++) {
                                        for (int j = 0; j < (tableau[0].length - 1); j++) {
                                            tableau[i][j] = ("[ ]");
                                            tableau[xPion1][yPion1 - 1] = ("[" + pion1 + "]");
                                            tableau[xPion2][yPion2] = ("[" + pion2 + "]");
                                            if (i == 0) {
                                                tableau[i][j] = Integer.toString(j);
                                            }
                                            if (j == 0) {
                                                tableau[i][j] = Integer.toString(i);
                                            }

                                            System.out.print(tableau[i][j] + "\t");
                                        }
                                        System.out.println();

                                    }
                                }else{
                                    reboucler = true;
                                    yPion1++;
                                }
                                if(yPion1 > 1) {
                                    yPion1--;
                                }else{
                                    yPion1 = 1;
                                }
                            }
                        //avancer à droite
                            if (droite == true) {
                                if( (tableau[xPion1][yPion1 + 1] != tableau[xPion2][yPion2]) && yPion1 < 10){
                                    for (int i = 0; i < (tableau.length - 1); i++) {
                                        for (int j = 0; j < (tableau[0].length - 1); j++) {
                                            tableau[i][j] = ("[ ]");
                                            tableau[xPion1][yPion1 + 1] = ("[" + pion1 + "]");
                                            tableau[xPion2][yPion2] = ("[" + pion2 + "]");
                                            if (i == 0) {
                                                tableau[i][j] = Integer.toString(j);
                                            }
                                            if (j == 0) {
                                                tableau[i][j] = Integer.toString(i);
                                            }

                                            System.out.print(tableau[i][j] + "\t");
                                        }
                                        System.out.println();

                                    }
                                }else{
                                    reboucler = true;
                                    yPion1--;
                                }
                                if(yPion1 < 10) {
                                    yPion1++;
                                }else{
                                    yPion1 = 10;
                                }
                            }
                            //avancer à haut
                            if (haut == true) {
                                if( (tableau[xPion1 - 1 ][yPion1] != tableau[xPion2][yPion2]) && xPion1 > 1){
                                    for (int i = 0; i < (tableau.length - 1); i++) {
                                        for (int j = 0; j < (tableau[0].length - 1); j++) {
                                            tableau[i][j] = ("[ ]");
                                            tableau[xPion1 - 1][yPion1] = ("[" + pion1 + "]");
                                            tableau[xPion2][yPion2] = ("[" + pion2 + "]");
                                            if (i == 0) {
                                                tableau[i][j] = Integer.toString(j);
                                            }
                                            if (j == 0) {
                                                tableau[i][j] = Integer.toString(i);
                                            }

                                            System.out.print(tableau[i][j] + "\t");
                                        }
                                        System.out.println();

                                    }
                                }else{
                                    reboucler = true;
                                    xPion1++;
                                }
                                if(xPion1 > 1) {
                                    xPion1--;
                                }else{
                                    xPion1 = 1;
                                }
                            }
                            //avancer à bas
                            if (bas == true) {
                                if( (tableau[xPion1 + 1][yPion1] != tableau[xPion2][yPion2]) && xPion1 < 11){
                                    for (int i = 0; i < (tableau.length - 1); i++) {
                                        for (int j = 0; j < (tableau[0].length - 1); j++) {
                                            tableau[i][j] = ("[ ]");
                                            tableau[xPion1 + 1 ][yPion1] = ("[" + pion1 + "]");
                                            tableau[xPion2][yPion2] = ("[" + pion2 + "]");
                                            if (i == 0) {
                                                tableau[i][j] = Integer.toString(j);
                                            }
                                            if (j == 0) {
                                                tableau[i][j] = Integer.toString(i);
                                            }

                                            System.out.print(tableau[i][j] + "\t");
                                        }
                                        System.out.println();

                                    }

                                }else{
                                    xPion1--;
                                }
                                if(xPion1 < 11) {
                                    xPion1++;
                                }else{
                                    xPion1 = 11;
                                }
                                
                            }


                            while ( reboucler == false){
                                System.out.println(joueur2 + ", c'est à toi de jouer. ");
                                System.out.println("Choisis bien ton déplacemnt: ('Z';'Q';'S';'D')");
                                joueur = scanner.next();
                                 gauche = joueur.equalsIgnoreCase("q");
                                 droite = joueur.equalsIgnoreCase("d");
                                 haut = joueur.equalsIgnoreCase("z");
                                 bas = joueur.equalsIgnoreCase("s");

                                //avancer à gauche
                                if (gauche == true) {
                                    if( (tableau[xPion2][yPion2 - 1] != tableau[xPion1][yPion1]) && yPion2 > 1){
                                        for (int i = 0; i < (tableau.length - 1); i++) {
                                            for (int j = 0; j < (tableau[0].length - 1); j++) {
                                                tableau[i][j] = ("[ ]");
                                                tableau[xPion2][yPion2 - 1] = ("[" + pion2 + "]");
                                                tableau[xPion1][yPion1] = ("[" + pion1 + "]");
                                                if (i == 0) {
                                                    tableau[i][j] = Integer.toString(j);
                                                }
                                                if (j == 0) {
                                                    tableau[i][j] = Integer.toString(i);
                                                }

                                                System.out.print(tableau[i][j] + "\t");
                                            }
                                            System.out.println();

                                        }
                                    }else{
                                        reboucler = true;
                                        yPion2++;
                                    }
                                    if(yPion2 > 1) {
                                        yPion2--;
                                    }else{
                                        yPion2 = 1;
                                    }
                                }
                                //avancer à droite
                                if (droite == true) {
                                    if( (tableau[xPion2][yPion2 + 1] != tableau[xPion1][yPion1]) && yPion2 < 10){
                                        for (int i = 0; i < (tableau.length - 1); i++) {
                                            for (int j = 0; j < (tableau[0].length - 1); j++) {
                                                tableau[i][j] = ("[ ]");
                                                tableau[xPion2][yPion2 + 1] = ("[" + pion2 + "]");
                                                tableau[xPion1][yPion1] = ("[" + pion1 + "]");
                                                if (i == 0) {
                                                    tableau[i][j] = Integer.toString(j);
                                                }
                                                if (j == 0) {
                                                    tableau[i][j] = Integer.toString(i);
                                                }

                                                System.out.print(tableau[i][j] + "\t");
                                            }
                                            System.out.println();

                                        }
                                    }else{
                                        reboucler = true;
                                        yPion2--;
                                    }
                                    if(yPion1 < 10) {
                                        yPion2++;
                                    }else{
                                        yPion2 = 10;
                                    }
                                }
                                //avancer à haut
                                if (haut == true) {
                                    if( (tableau[xPion2 - 1 ][yPion2] != tableau[xPion1][yPion1]) && xPion2 > 1){
                                        for (int i = 0; i < (tableau.length - 1); i++) {
                                            for (int j = 0; j < (tableau[0].length - 1); j++) {
                                                tableau[i][j] = ("[ ]");
                                                tableau[xPion2 - 1][yPion2] = ("[" + pion2 + "]");
                                                tableau[xPion1][yPion1] = ("[" + pion1 + "]");
                                                if (i == 0) {
                                                    tableau[i][j] = Integer.toString(j);
                                                }
                                                if (j == 0) {
                                                    tableau[i][j] = Integer.toString(i);
                                                }

                                                System.out.print(tableau[i][j] + "\t");
                                            }
                                            System.out.println();

                                        }
                                    }else{
                                        reboucler = true;
                                        xPion2++;
                                    }
                                    if(xPion1 > 1) {
                                        xPion2--;
                                    }else{
                                        xPion2 = 1;
                                    }
                                }
                                //avancer à bas
                                if (bas == true) {
                                    if( (tableau[xPion2 + 1][yPion2] != tableau[xPion1][yPion1]) && xPion2 < 11){
                                        for (int i = 0; i < (tableau.length - 1); i++) {
                                            for (int j = 0; j < (tableau[0].length - 1); j++) {
                                                tableau[i][j] = ("[ ]");
                                                tableau[xPion2 + 1 ][yPion2] = ("[" + pion2 + "]");
                                                tableau[xPion1][yPion1] = ("[" + pion1 + "]");
                                                if (i == 0) {
                                                    tableau[i][j] = Integer.toString(j);
                                                }
                                                if (j == 0) {
                                                    tableau[i][j] = Integer.toString(i);
                                                }

                                                System.out.print(tableau[i][j] + "\t");
                                            }
                                            System.out.println();

                                        }
                                    }else{
                                        reboucler = true;
                                        xPion2--;
                                    }
                                    if(xPion2 < 11) {
                                        xPion2++;
                                    }else{
                                        xPion2 = 11;
                                    }
                                }

                                reboucler = true;
                        }
                            reboucler = false;
                    }
                }
            }

        }
    }
        return resultat;
    }
}