package main;

import main.beans.PartyBean;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nom joueur 1:");
        String j1 = scanner1.nextLine();

        scanner1 = new Scanner(System.in);
        System.out.println("Nom joueur 2:");
        String j2 = scanner1.nextLine();


        PartyBean game = new PartyBean(j1, j2);

        int NB_TOUR = 10;
        int SCORE_TO_REACH = 7;

        while (game.getRound() < NB_TOUR && game.getJ1().getScore() < SCORE_TO_REACH && game.getJ2().getScore() < SCORE_TO_REACH) {
            game.add1Round();

            game.getJ1().roll();
            game.getJ2().roll();

            if (game.getJ1().getCup().getScoreDices() >= 7) {
                game.getJ1().add1Point();
            }
            if (game.getJ2().getCup().getScoreDices() >= 7) {
                game.getJ2().add1Point();
            }
        }

        System.out.println(game.getJ1().getName() + " : " + game.getJ1().getScore());
        System.out.println(game.getJ2().getName() + " : " + game.getJ2().getScore());
        if (game.winner() != null) {
            System.out.println("Le gagnant est: " + game.winner().getName());
        } else {
            System.out.println("Égalité");
        }
    }

    public static int hourAndMinuteToSecond(int hours, int minutes) {
        return hours * 3600 + minutes * 60;
    }

    public static int hourToMinute(int hours) {
        return hours * 60;
    }

    public static int minuteToSecond(int minutes) {
        return minutes * 60;
    }

    public static void boulangerieInteractive() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre de croissant : ");
        int nbCroissant = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre de baguette : ");
        int nbBaguette = scanner2.nextInt();
        boulangerie(nbCroissant, nbBaguette);
    }


    public static void boulangerie(int nbCroissant, int nbBaguette) {
        double total = (nbCroissant * 1.10) + (nbBaguette * 0.90);
        System.out.println("Prix total pour " + nbCroissant + " croissants et " + nbBaguette + " baguettes: " + total + "€.");
    }

    public static void crepeInteractive() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre de crêpes : ");
        int nombre = scanner.nextInt();
        crepes(nombre);
    }

    public static void exo1() {
        int i = 7;
        int j = 3;


        int divEnt = i / j;
        System.out.println("divEnt= " + divEnt);

        int reste = i % j;
        System.out.println("reste= " + reste);

        double divClassique = i / (double) j;
        System.out.println("divClassique= " + divClassique);

        double somme = divEnt + reste + divClassique;
        System.out.println("somme= " + somme);
    }

    public static void crepes(int i) {

        int farine = i * 20;
        int oeuf = i / 5;

        System.out.println("Pour " + i + " crêpes il faut:\n-" + farine + "g de farine\n-" + oeuf + " oeufs");

    }

}