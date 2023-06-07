package VerhicleManagment;

public class Lastkraftwagen extends Fahrzeug {
    int hoehe;
    private int gewicht;
    boolean lkw;


    public Lastkraftwagen(String name, int raeder, int hp, int sitze, int tueren, int hoehe, int gewicht, boolean lkw) {
        super(name, raeder, hp, sitze, tueren);
        this.hoehe = hoehe;
        this.gewicht = gewicht;
        this.lkw = lkw;


    }


    public void printGewicht() {
        System.out.println("Das Maximale zulaessige Hoechstgewicht beträgt " + gewicht + " tonnen");
    }

    public void printHoehe() {
        System.out.println("Die Maximale höhe ist "+ hoehe + " Meter");
    }


    public void printLkw() {
        System.out.println("Dieses Fahrzeug ist ein LKW");
    }
    public void setLkw(boolean lkw) {this.lkw = lkw; }

    public boolean getLkw() { return lkw;}

    public void setGewicht(int gewicht) { this.gewicht = gewicht; }
    public int getGewicht() {
        return gewicht;
    }



    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public int getHoehe() {
        return hoehe;
    }

}
