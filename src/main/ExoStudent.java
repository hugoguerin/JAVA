package main;

import main.beans.StudentBean;

import java.util.Random;

public class ExoStudent {

    public static void main(String[] args) {

        StudentBean toto = new StudentBean();
        toto.note = 10;
        toto.name = "Toto";

        System.out.println(toto.name);
        System.out.println(toto.note);

        printStudent(toto);

    }

    public static StudentBean bestBob(StudentBean[] tab) {
        if (tab == null) {
            return null;
        }
        StudentBean sortie = null;
        int bestBobNote = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != null && tab[i].name != null) {
                if ((tab[i].name.equals("Bob")) && tab[i].note >= bestBobNote) {
                    bestBobNote = tab[i].note;
                    sortie = tab[i];
                }
            }
        }

        return sortie;
    }

    public static void printStudents(StudentBean[] tab) {
        if (tab != null) {
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] == null) {
                    System.out.println("null");
                } else {
                    System.out.println(tab[i].name + " : " + tab[i].note);

                }
            }
        }
    }


    public static void createStudents(StudentBean[] tab) {
        if (tab != null) {
            for (int i = 0; i < tab.length; i++) {
                tab[i] = new StudentBean();
                tab[i].name = (getRandomName());
                tab[i].note = (new Random().nextInt(20));
            }
        }
    }


    public static String getRandomName() {
        String[] name = new String[]{"Toto", "Bob", "Alfred"};
        return name[new Random().nextInt(name.length)];
    }

    public static StudentBean bestStudent(StudentBean e1, StudentBean e2) {
        if (e1 == null) {
            return e2;
        } else if (e2 == null) {
            return e1;
        }


        if (e1.note > e2.note) {
            return e1;
        } else if (e2.note > e1.note) {
            return e2;
        } else {
            return null;
        }
    }

    public static void doubleNote(StudentBean e) {
        if (e != null) {
            e.note = (e.note * 2);
            if (e.note > 20) {
                e.note = 20;
            }
        }
    }


    public static void printStudent(StudentBean e) {
        if (e == null) {
            System.out.println("Null");
        } else {
            System.out.println(e.name + " : " + e.note);
        }
    }
}
