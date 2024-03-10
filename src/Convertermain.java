import Convertermorse.Converter;

import java.util.Scanner;

public class Convertermain {
    public static void main(String[] args) {

        //Här ska vi ha scanner men börjar med satta värden på variablerna
        Scanner scan=new Scanner(System.in);
        // en sout med flavor text/instruktion
        System.out.println("Skriv in valfri bokstav A-Z för att få ut det i morsekod:");
        //variabel av typen sträng till scanner.
        String text= scan.nextLine();


        //kalla på min converter för att konvertera bokstäver till morsekod.
        Converter converter=new Converter();
       // String morse=Converter.getLetter(text);
        String morse=Converter.getWord(text);

        //sout för att skriva ut konverterad morsekod.
        System.out.println(morse);

    }
}