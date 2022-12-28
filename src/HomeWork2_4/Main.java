package HomeWork2_4;

public class Main {
    public static void main(String[] args) {

        System.out.println("          Объекты класса Car:");
        Car[] cars = new Car[4];
        cars[0] = new Car("Ford", "Focus RS WRC", 2F);
        cars[1] = new Car("Opel", "Corsa",2.1F);
        cars[2] = new Car("Peugeot", "Sport", 2F);
        cars[3] = new Car("Citroen", "C2", 2F);

        for (Car i :cars) System.out.println(i);
        System.out.println();

        System.out.println("          Объекты класса Bas:");
        Bus[] buses = new Bus[4];
        buses[0] = new Bus("Икарус", "365", 5);
        buses[1] = new Bus("ПАЗ", "Вектор NEXT 8.8", 4);
        buses[2] = new Bus("ЛиАЗ", "6213", 6);
        buses[3] = new Bus("ЛиАЗ", "6213", 6);

        for (Bus i : buses) System.out.println(i);
        System.out.println();

        System.out.println("          Объекты класса Truck:");
        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("КАМАЗ", "4326", 16.2F);
        trucks[1] = new Truck("МАЗ", "6440 RR", 12.5F);
        trucks[2] = new Truck("Praga", "V4S DKR", 16F);
        trucks[3] = new Truck("Tatra", "Phoenix", 1.9F);

        for (Truck i : trucks) System.out.println(i);
        System.out.println();
    }
}
