package VerhicleManagment;

public class Fahrzeug{
    String name;
    int raeder;
    int hp;
    int sitze;
    int tueren;
    public Fahrzeug(String name, int raeder, int hp, int sitze, int tueren) {
        this.name = name;
        this.raeder = raeder;
        this.hp = hp;
        this.sitze = sitze;
        this.tueren = tueren;
    }
    public void printName() {
        System.out.println("Das Fahrzeug heißt "+ name);
    }
    public void printWheels() {
        System.out.println("Das Fahrzeug hat "+ raeder +" Räder");
    }
    public void printHorsePower() {
        System.out.println("Das Fahrzeug hat "+ hp +" PS");
    }
    public void printDoors() {
        System.out.println("Das Fahrzeug hat "+ tueren +" Tueren");
    }
    public void printSeats() {
        System.out.println("Das Fahrzeug hat "+ sitze +" Sitze");
    }
}
