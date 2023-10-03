package main;

public class ExoFor {


    public static void main(String[] args) {


        System.out.println(asciiAverage("engagelejeuquejelegagne"));

    }

    public static char asciiAverage(String string) {
        char sortie = (char) 0;
        if (string.length() == 0) {
            return sortie;
        }

        for (int i = 0; i < string.length(); i++) {
            sortie += (int) string.charAt(i);
        }

        sortie /= string.length();

        return (char) sortie;

    }


    public static boolean isPalindrome(String string) {
        if (string.length() == 0) {
            return true;
        }

        boolean sortie = false;
        int reverseI = string.length() - 1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(reverseI)) {
                sortie = true;
            } else {
                sortie = false;
                break;
            }
            reverseI--;
        }
        return sortie;
    }

    public static String trim(String string) {
        return string.trim();
    }

    public static String trimStart(String string) {
        int i = 0;
        while (i < string.length() && string.charAt(i) == ' ') {
            i++;
        }
        return string.substring(i);
    }


    public static String spaceTo_(String string) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                newString += string.charAt(i);
            } else {
                newString += '_';
            }
        }
        return newString;
    }

    public static char maxLetter(String string) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int maxIndex = 0;

        for (int i = 0; i < string.length(); i++) {
            char currentLetter = string.charAt(i);

            if (currentLetter == ' ') {
                continue;
            }
            int currentLetterIndex = 0;
            for (int j = 0; j < alphabet.length; j++) {
                if (currentLetter == alphabet[j]) {
                    currentLetterIndex = j;
                }
            }
            if (currentLetterIndex > maxIndex) {
                maxIndex = currentLetterIndex;
            }
        }
        return alphabet[maxIndex];
    }

    public static String withoutUpp(String string) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            char currentLetter = string.charAt(i);
            if (Character.isLowerCase(currentLetter) || (currentLetter == ' ')) {
                newString += currentLetter;
            }
        }
        return newString;
    }

    public static String withoutVowel(String string) {

        String noVowels = "";
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        boolean contains = false;

        for (int i = 0; i < string.length(); i++) {
            contains = false;
            char currentLetter = string.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (currentLetter == vowels[j]) {
                    contains = true;
                }
            }
            if (!contains) {
                noVowels += currentLetter;
            }

        }
        return noVowels;
    }


    public static int nbUppercase(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }


    public static String reverse(String string) {
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
        return reverse;
    }

    public static int nbA(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'A') {
                count++;
            }
        }
        return count;
    }

    public static String withoutE(String string) {
        String noE = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != 'e' && string.charAt(i) != 'E') {
                noE += string.charAt(i);
            }
        }
        return noE;
    }

    public static void fibo() {
        int nbr1 = 0;
        int nbr2 = 1;
        int somme = nbr1 + nbr2;

        System.out.print(nbr2 + " ");

        while (somme <= 987) {
            System.out.print(somme + " ");
            nbr1 = nbr2;
            nbr2 = somme;
            somme = nbr1 + nbr2;
        }
    }

    public static void testFor() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (int i = 5; i < 13; i++) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (int i = 4; i <= 48; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print(i + " ");
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print(i + " ");
            }
        }

    }


}
