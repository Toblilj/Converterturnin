package Convertermorse;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Convertertest {

    //testfall för att testa att min arraylist skriver ut rätt bokstav i mores kod
@Test
    public void testAtoMorse(){
    Converter converter=new Converter();
    String testdata="A";

    String expected=".-";

    String acctual=Converter.getLetter(testdata);

    assertEquals(expected,acctual);


}
//testfall för att testa att min metod för att skriva ut hela ord i morsekod fungerar
@Test
    public void testWordToMorse(){
    Converter converter=new Converter();
    String testdata="hej";

    String expected=".... . .---";

    String actual=converter.getWord(testdata);

    assertEquals(expected,actual);
}


//testfall för att testa att det går att få ut siffror i morsekod
@Test
    public void testcToMorse(){
    Converter converter=new Converter();
    String testdata="9";

    String expected="----.";

    String actual=Converter.getLetter(testdata);

    assertEquals(expected,actual);

    }

    //testfall för att testa att min kod kan registrera och skriva ut giltigt specialtecken
@Test
    public void testSpecialcharToMorse () {
    Converter converter=new Converter();
    String testdata="?";

    String expected="..--..";

    String actual=Converter.getLetter((testdata));

    assertEquals(expected,actual);

}
/*
@Test
    public void testLowerCaseToMorse() {
    Converter converter=new Converter();
    char testChar='a';

    String expected=".-";

    String actual=Converter.charToMorse(testChar);

    assertEquals(expected,actual);
} */


}
