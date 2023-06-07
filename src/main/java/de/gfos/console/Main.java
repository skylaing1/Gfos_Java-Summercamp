package de.gfos.console;

import de.gfos.console.util.Console;

public class Main {

    public static void main(String[] args) {
        System.out.println("Was ist 2 - 2: ");
    String text = Console.readString();
    if (text.equals("0")){
        System.out.println("richtig");
    }
    else if(text.equals("4")){
        System.out.println("bist du doof?");
    } else {
        System.out.println("falsch");
    }
    //System.out.println("Die Eingabe war: " + text);

    }

}
