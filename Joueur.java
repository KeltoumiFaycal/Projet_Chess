package com.company;

public class Joueur {

    public String pseudo;
    public String pion;

    public Joueur( String pseudo , String pion ){

        this.pseudo = pseudo;
        this.pion = pion;
    }
    public String getPseudo(){
        return pseudo;
    }
    public String getPion(){
        return pion;
    }
    public void showBalance(){
        System.out.println("Votre nom est " + pseudo + " et votre pion est " + pion );
    }
}
