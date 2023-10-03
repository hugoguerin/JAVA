package main;

import java.util.Random;

public class ExoTab {

    public static void main(String[] args) {

        int[] tab = new int[]{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0};

        printTab(tab);

        flags(tab);

        System.out.println();

        printTab(tab);


    }

    public static void flags(int[] tab) {

        int count1 = 0;
        int count2 = tab.length - 1;

        for (int i = 0; i <= count2; i++) {
            if (tab[i] == 0) {
                tab[i] = tab[count1];
                tab[count1] = 0;
                count1++;
            } else if (tab[i] == 2) {
                tab[i] = tab[count2];
                tab[count2] = 2;
                count2--;
                i--;
            }
        }
    }


    public static int[] fusionTrier(int[] sortTab1, int[] sortTab2) {

        int[] newTab = new int[sortTab1.length + sortTab2.length];

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < newTab.length; i++) {

            if (count1 >= sortTab1.length) {
                newTab[i] = sortTab2[count2];
                count2++;
            } else if (count2 >= sortTab2.length) {
                newTab[i] = sortTab1[count1];
                count1++;
            } else if (sortTab1[count1] <= sortTab2[count2]) {
                newTab[i] = sortTab1[count1];
                count1++;
            } else {
                newTab[i] = sortTab2[count2];
                count2++;
            }
        }
        return newTab;
    }

    //Teste si le tableau est trié par ordre croissant
    public static boolean isSorted(int[] tab) {
        boolean isSorted = true;

        for (int i = 1; i < tab.length; i++) {
            if (tab[i - 1] > tab[i]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    //Trie le tableau par ordre croissant, sans utiliser la méthode sort de Java
    public static void sortTab(int[] tab) {
        int holder = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < tab.length - i; j++) {
                if (tab[j - 1] > tab[j]) {
                    holder = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = holder;
                }
            }
        }
    }

    //Crée et retourne un nouveau tableau qui est la concaténation des 2 tableaux en entrée
//[1,5,7] [3,4,8,9] -> [1,5,7,3,4,8,9]
    public static int[] fusion(int[] tab1, int[] tab2) {
        int[] newTab = new int[tab1.length + tab2.length];

        int currentPos = 0;

        for (int i = 0; i < tab1.length; i++) {
            newTab[currentPos] = tab1[i];
            currentPos++;
        }

        for (int i = 0; i < tab2.length; i++) {
            newTab[currentPos] = tab2[i];
            currentPos++;
        }

        return newTab;
    }


    public static int nbMax(int[] tab) {
        int count = 0;
        int max = getMax(tab);

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == max) {
                count++;
            }
        }

        return count;
    }


    public static void supAverage(int[] tab) {
        double average = average(tab);
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > average) {
                System.out.print(tab[i] + " ");
            }
        }
    }

    public static double average(int[] tab) {
        return (double) sum(tab) / tab.length;
    }

    public static int sum(int[] tab) {
        int somme = 0;

        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        return somme;
    }


    //Permute l’emplacement i et j dans le tableau
    // {5, 8, 4, 2} permute avec i=0 et j=3 ->   {2, 8, 4, 5}
    public static void permute(int[] tab, int i, int j) {
        int holder = tab[i];
        tab[i] = tab[j];
        tab[j] = holder;
    }


    //Retourne la valeur maximum du tableau
    public static int getMax(int[] tab) {
        int max = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] >= max) {
                max = tab[i];
            }

        }
        return max;
    }

    //Affiche le tableau dans la console sur 1 seule ligne
    public static void printTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    //Remplis le tableau de valeurs aléatoires comprises entre 0 et99
    public static void fillTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(100);
        }
    }

    public static void add1(int a, int[] array) {
        a += 1;
        for (int i = 0; i < array.length; i++) {
            array[i] += 1;
        }
    }

    public static void exo1() {
        int[] array = new int[]{2, 5, 8, 12, 20};
        System.out.println(array[4]);
        array[1] = 12;

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ":" + array[i]);
            array[i] += 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int somme = 0;
        for (int i = 0; i < array.length; i++) {

            if (i > 0) {
                array[i] = array[i - 1] + 1;

                System.out.println(array[i]);
            } else {
                System.out.println(array[i]);
            }
            somme += array[i];
        }

        System.out.println(somme);

    }
}
