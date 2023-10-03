package main;

import main.beans.HouseBean;

import java.util.Random;

public class ExoHouse {

    public static void main(String[] args) {

        HouseBean[] tab = new HouseBean[5];
        createHouses(tab);

        printHouses(tab);

        System.out.println("La plus grande est: " + bigHouses(tab));

    }


    public static HouseBean bigHouses(HouseBean[] tab) {
        if (tab == null) {
            return null;
        }

        HouseBean sortie = tab[0];
        int max = 0;

        if (tab[0] != null) {
            max = tab[0].getArea();
        }

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] != null) {
                if (tab[i].getArea() >= max) {
                    max = tab[i].getArea();
                    sortie = tab[i];
                }
            }
        }

        return sortie;
    }

    public static void printHouses(HouseBean[] tab) {
        if (tab != null) {
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] == null) {
                    System.out.println("null");
                } else {
                    System.out.println(tab[i].getWidth() + "x" + tab[i].getLength());

                }
            }
        }
    }

    public static void createHouses(HouseBean[] tab) {
        if (tab != null) {
            for (int i = 0; i < tab.length; i++) {
                tab[i] = new HouseBean();
                tab[i].setWidth(new Random().nextInt(100));
                tab[i].setLength(new Random().nextInt(100));
            }
        }
    }

    public static void testTab() {
        HouseBean[] tab = new HouseBean[5];
        System.out.println(tab[2]);

        HouseBean m1 = new HouseBean();
        m1.setWidth(10);

        tab[0] = m1;
        tab[1] = m1;
        tab[2] = m1;

        System.out.println(tab[0].getWidth());
        System.out.println(tab[1].getWidth());
        System.out.println(tab[2].getWidth());

        tab[0].setWidth(20);

        System.out.println(tab[0].getWidth());
        System.out.println(tab[1].getWidth());
        System.out.println(tab[2].getWidth());

        System.out.println(tab[3].getWidth());
    }


    public static HouseBean bigHouse(HouseBean m1, HouseBean m2) {

        if (m1 == null) {
            return m2;
        } else if (m2 == null) {
            return m1;
        }

        int m1Size = m1.getArea();
        int m2Size = m2.getArea();
        if (m1Size > m2Size) {
            return m1;
        } else if (m2Size > m1Size) {
            return m2;
        } else {
            return null;
        }
    }

    public static void doubleHouse(HouseBean m) {
        if (m != null) {

            m.setWidth(m.getWidth() * 2);
            m.setLength(m.getLength() * 2);
        }
    }

    public static void printHouse(HouseBean m) {
        if (m == null) {
            System.out.print("Null");
        } else {
            System.out.print(m.getWidth() + "x" + m.getLength());
        }
    }


    public static void exo1() {
        HouseBean m = null;
        System.out.println(m);
        m = new HouseBean();
        System.out.println(m);
        m.setWidth(5);
        System.out.println(m.getWidth());

        HouseBean m2 = m;
        System.out.println(m);
        System.out.println(m.getWidth());

        m2.setWidth(10);
        System.out.println(m.getWidth());
        System.out.println(m2.getWidth());
    }
}
