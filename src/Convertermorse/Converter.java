package Convertermorse;

import java.lang.IllegalArgumentException;

public class Converter {


    //min arraylist som innehåller morsekods alafabetet index 38 (39 om man räknar 0)
    private static final String[] MorseAlphabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--..",
            "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...",
            "---..", "----.", " .-.-.-", "--..--", " ..--.."};

    //skapa konstruktorer för mina testfall
    public static String getLetter(String text) {
        StringBuilder morse = new StringBuilder();
        for (char c : text.toCharArray()) { //for loop för att kolla om man skrivit in giltigt tecken
            if (c == 'ö' || c == 'å' || c == 'ä') {
                throw new IllegalArgumentException("Illegal character: " + c);
            }
            if (Character.isUpperCase(c)) {
                morse.append(charToMorse(Character.toLowerCase(c)));
            } else {
                morse.append(charToMorse(c));
            }
        }
        return morse.toString().trim();
    }


    public static String charToMorse(char c) {
        try {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c >= '.' && c <= '?')) {
                //if satser för att kolla vilket giltigt tecken man skrivit on sedan retunera giltigt teckens värde ifrån min
                //array list

                //denna if sats kontrollerar om man skrivit in stor eller liten bokstav,siffor eller special tecken.
                if (c >= 'A' && c <= 'Z') {
                    return MorseAlphabet[c - 'A'];
                } else if (c >= 'a' && c <= 'z') {
                    return MorseAlphabet[c - 'a'];
                } else if (c >= '0' && c <= '9') {
                    return MorseAlphabet[c - '0' + 26];
                } else if (c == '?') {
                    return MorseAlphabet[38];
                } else if (c == '.') {
                    return MorseAlphabet[36];
                } else if (c == ',') {
                    return MorseAlphabet[37];

                }
            }

        } catch (IllegalArgumentException e) {
            System.out.println("ö,å,ä ej giltiga bokstäver");
        }
        return "";
    }

    public static String getWord(String testdata) {
        String word = ""; //min metod för att skriva ut hela ord i morsekod
        try {

            for (int i = 0; i < testdata.length(); i++) {
                word += getLetter(String.valueOf(testdata.charAt(i))) + " ";
            }
        } catch (IllegalArgumentException e) {
            System.out.println("ö,å,ä ej giltiga bokstäver");
        }
        return word.trim();
    }




  /* //boolean för att kolla om tecken är giltigt eller ej dvs true lr false (true är den om det finns in min array list)
    private static boolean validChars(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                || c == '?' || c == '.' || c == ',');


    } */
}





