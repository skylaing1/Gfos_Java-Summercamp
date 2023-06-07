package VerhicleManagment;

import de.gfos.console.util.Console;

import java.util.ArrayList;
import java.util.List;

public class Fahrzeugverwaltung {
    List<Fahrzeug> alleFahrzeuge = new ArrayList<>();

    public void loeschen() {
        System.out.println("Das wie vielete Fahrzeug wollen sie Löschen?");
        int index = Console.readInt() - 1;
        if (index > alleFahrzeuge.size() - 1) {
            System.out.println("Fehler es gibt kein "+index + "tes fahrzeug\n");
        } else {
            alleFahrzeuge.remove(index);
        }
    }
    public void ausgeben() {
        for (Fahrzeug aktuell : alleFahrzeuge) {
            aktuell.printName();
            aktuell.printHorsePower();
            aktuell.printDoors();
            aktuell.printSeats();
            aktuell.printWheels();
            aktuell.getClass().getName();
            if (aktuell instanceof Lastkraftwagen) {
                ((Lastkraftwagen) aktuell).printGewicht();
                ((Lastkraftwagen) aktuell).printHoehe();
                ((Lastkraftwagen) aktuell).printLkw();
                System.out.println();
            }
        System.out.println();

        }
        System.out.println();

    }


    public void fuegeFahrzeughinzu() {
        System.out.println("Name?");
        String name = Console.readString();
        System.out.println("Raeder?");
        int raeder = Console.readInt();
        System.out.println("Pferde Staerke?");
        int hp = Console.readInt();
        System.out.println("Sitze?");
        int sitze = Console.readInt();
        System.out.println("Tueren?");
        int tueren = Console.readInt();
        System.out.println("LKW?");
        boolean lkw = Console.readBoolean();
        if (lkw) {
            System.out.println("Hoehe?");
            int hoehe = Console.readInt();
            System.out.println("Gewicht?");
            int gewicht = Console.readInt();
            alleFahrzeuge.add(new Lastkraftwagen(name, raeder, hp, sitze, tueren, hoehe, gewicht, true));
        } else {
            alleFahrzeuge.add(new Fahrzeug(name, raeder, hp, sitze, tueren));
        }
    }
}




