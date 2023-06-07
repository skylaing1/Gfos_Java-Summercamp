package de.gfos.console;

import de.gfos.console.util.Console;

public class Fibonacci {
    public static void main(String[] args) {
        int eingabe = Console.readInt() - 2;
        int ergebnis = rechner(eingabe);
        System.out.println(ergebnis);
    }
    public static int rechner(int eingabe) {
        int zahl2 = 0;
        int zahl1 = 1;
        int summe = 0;
        for (int i = 0; i != eingabe; i++) {
            summe = zahl1 + zahl2;
            zahl2 = zahl1;
            zahl1 = summe;

        }
        return summe;
    }
}
