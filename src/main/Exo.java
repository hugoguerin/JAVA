package main;

import java.util.Scanner;

public class Exo {

    public static void main(String[] args) {

    }


    public static char charAt3(String myString) {
        if (myString.length() >= 3) {
            return myString.charAt(2);
        } else {
            return '?';
        }
    }

    public static boolean testIf8(int x) {
        return true;
    }

    public static boolean testIf7(int x) {
        return true;
    }

    public static boolean testIf6(int x) {
        return x != 0;
    }

    public static boolean testIf5(int x) {
        return (x >= 2 && x <= 18) || (x == 50) || (x >= 60);

    }

    public static boolean testIf4(int x) {
        return (x >= 2 && x <= 18) || (x == 40) || (x == 50) || (x >= 60);

    }

    public static boolean testIf3(int x) {
        if (x >= -5) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean testIf2(int x) {
        if ((x >= 5 && x <= 25) || (x >= 12 && x < 48)) {
            return true;
        } else {
            return false;
        }
    }

    public static void maxInteractive() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("a : ");
        int a = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("b : ");
        int b = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("c : ");
        int c = scanner3.nextInt();

        System.out.println("Le plus grand est: " + max(a, b, c));

    }

    public static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }


}
