package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String joueur;
        while (true) {

            boolean retour = false;
            int resultat = Menu.menu();
            while (retour == false){

               if(resultat == 1){
                   int nbJoueur = NombreDeJoueur.nbJoueurs();

                   if( resultat == 3 ){
                       System.out.println("Joueur 1, donne-moi ton pseudo");
                       String joueur1 = nbtJoueur.pseudo();
                       System.out.println("maintenant, donne-moi ton pion");
                       String pion1 = nbtJoueur.pion();
                       Joueur joueurP1 = new Joueur(joueur1 , pion1);
                       joueurP1.showBalance();

                       System.out.println("Joueur 2, donne-moi ton pseudo");
                       String joueur2 = nbtJoueur.pseudo();
                       System.out.println("maintenant, donne-moi ton pion");
                       String pion2 = nbtJoueur.pion();
                       Joueur joueurP2 = new Joueur(joueur2 , pion2);
                       joueurP2.showBalance();

                       System.out.println("Joueur 3, donne-moi ton pseudo");
                       String joueur3 = nbtJoueur.pseudo();
                       System.out.println("maintenant, donne-moi ton pion");
                       String pion3 = nbtJoueur.pion();
                       Joueur joueurP3 = new Joueur(joueur3 , pion3);
                       joueurP3.showBalance();

                   }
                   if( resultat == 4 ){
                       System.out.println("Joueur 1, donne-moi ton pseudo");
                       String joueur1 = nbtJoueur.pseudo();
                       System.out.println("maintenant, donne-moi ton pion");
                       String pion1 = nbtJoueur.pion();
                       Joueur joueurP1 = new Joueur(joueur1 , pion1);
                       joueurP1.showBalance();

                       System.out.println("Joueur 2, donne-moi ton pseudo");
                       String joueur2 = nbtJoueur.pseudo();
                       System.out.println("maintenant, donne-moi ton pion");
                       String pion2 = nbtJoueur.pion();
                       Joueur joueurP2 = new Joueur(joueur2 , pion2);
                       joueurP2.showBalance();

                       System.out.println("Joueur 3, donne-moi ton pseudo");
                       String joueur3 = nbtJoueur.pseudo();
                       System.out.println("maintenant, donne-moi ton pion");
                       String pion3 = nbtJoueur.pion();
                       Joueur joueurP3 = new Joueur(joueur3 , pion3);
                       joueurP3.showBalance();

                   }
                   int tableau = Plateau.AfficheMonTableau(nbJoueur);

                   System.out.println("Tapez 'r' pour retourner au menu principal :");
                   System.out.println("Ou taper 'p' pour relancer une partie : ");
                   joueur = scanner.next();
                   boolean recommencer = joueur.equals("p");
                   boolean retourMenu = joueur.equals("r");
                   if ( recommencer == true ){
                       resultat = 1;
                   }
                   if( retourMenu == true ){
                       retour = true;
                   }

               }
               if(resultat == 2){
                   while (retour == false) {
                       System.out.println("                                                    REGLES :");
                       System.out.println("-Le but du jeu est de bloquer l’adversaire,\n"
                               + "-Les déplacements se font a tour de rôles.\n"
                               + "-À chaque déplacement le joueur a le droit de détruire une case, ce qui limite les déplacements au fil des tours.\n"
                               + "-Lorsqu’un joueur ne peut plus se déplacer la partie prend fin et il perd sauf si il y a plusieurs joueur,\n"
                               + "-Alors la partie prend fin quand il reste 1 seul joueur.\n"
                               + "-Il y a une zone limitée qui empêche les joueurs d’aller plus loin.");

                       System.out.println("\nTape 'r' pour retourner au menu principal :");
                       joueur = scanner.next();
                       boolean retourMenu = joueur.equals("r");
                       if( retourMenu == true){
                           retour = true;
                       }
               }
                if (resultat == 3) {
                    System.out.println("Le jeu s'éteind. \nN'éteingnez pas votre ordinateur" +
                            "\n1%" +
                            "\n5%" +
                            "\n10%" +
                            "\n20%" +
                            "\n30%" +
                            "\n40%" +
                            "\n50%" +
                            "\n60%" +
                            "\n70%" +
                            "\n80%" +
                            "\n90%" +
                            "\n100%" +
                            "\nFinis :");

                    return;
                }
               }
            }
        }
    }
}
