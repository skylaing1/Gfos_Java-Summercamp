package de.gfos.console;

import de.gfos.console.util.Console;

import java.util.ArrayList;

public class Texte {
    public static void main(String[] args) {
        ArrayList<String> Texte = new ArrayList<>();
        System.out.println("Geben sie ihren Text ein....");
        Texte.add(Console.readString());
        boolean mehr = true;
        System.out.println("Mehr texte?");
        mehr = Console.readBoolean();
        while (mehr == true) {
            System.out.println("Naechster Text");
            Texte.add(Console.readString());
            System.out.println("Mehr texte?");
            mehr = Console.readBoolean();
        }
        System.out.println(Texte);
    }

}
