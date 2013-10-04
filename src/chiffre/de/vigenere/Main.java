package chiffre.de.vigenere;


public class Main {
    public static void main(String[] args){
        ChiffreDeVigenere exampleOne = new ChiffreDeVigenere("ATTACKATDAWN","LEMON");
        ChiffreDeVigenere exampleTwo = new ChiffreDeVigenere("lxfopvefrnhr","LEMON");

        exampleOne.encrypt();
        exampleTwo.decrypt();
    }
}
