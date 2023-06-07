package de.gfos.console;

import de.gfos.console.util.Console;

public class Taschenrechner {

    public static void main(String[] args) {
        System.out.println("Geben sie zwei Zahlen ein Geben sie Danach die Arithmetische operation ein");
        int summe = 0;
        int Zahl1 = Console.readInt();
        int Zahl2 = Console.readInt();
        char operation = Console.readChar();
        if (operation == '-') {
            summe = Zahl1 - Zahl2;
        } else if (operation == '+') {
            summe = Zahl1 + Zahl2;
        } else {
            System.out.println("Falsche Eingabe");
        }
        System.out.println(summe);
    }
}