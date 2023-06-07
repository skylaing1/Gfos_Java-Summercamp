package VerhicleManagment;

import de.gfos.console.util.Console;

public class Starter {
    public static void main(String[] args) {
        boolean mehr = true;
        Fahrzeugverwaltung meineFahrzeugverwaltung = new Fahrzeugverwaltung();
        while (mehr) {
            meineFahrzeugverwaltung.fuegeFahrzeughinzu();
            System.out.println("Mehr Fahrzeuge Hinzufügen?");
            mehr = Console.readBoolean();
        }

        meineFahrzeugverwaltung.ausgeben();
        System.out.println("Wollen sie Etwas Löschen?");
        boolean delete = Console.readBoolean();
        while (delete) {
            meineFahrzeugverwaltung.loeschen();
            meineFahrzeugverwaltung.ausgeben();
            System.out.println("wieder Löschen");

            delete = Console.readBoolean();
        }
    }
}
