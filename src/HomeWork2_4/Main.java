package HomeWork2_4;

public class Main {
    public static void main(String[] args) {

        System.out.println("          Объекты класса Car:");
        Car[] cars = new Car[3];
        cars[0] = new Car("Kia", "Sportage 4-го поколения", 2.4F);
        cars[1] = new Car("Audi", "A8 50 L TDI quattro",3.0F);
        cars[2] = new Car("BMW", "Z8", 3F);

        for (Car i :cars) System.out.println(i);
        System.out.println();

        System.out.println("          Объекты класса Bas:");
        Bus[] buses = new Bus[3];
        buses[0] = new Bus("Икарус", "365", 5);
        buses[1] = new Bus("ПАЗ", "Вектор NEXT 8.8", 4);
        buses[2] = new Bus("ЛиАЗ", "6213", 6);

        for (Bus i : buses) System.out.println(i);
        System.out.println();

        System.out.println("          Объекты класса Truck:");
        Truck[] trucks = new Truck[3];
        trucks[0] = new Truck("КАМАЗ", "4326", 16.2F);
        trucks[1] = new Truck("МАЗ", "6440 RR", 12.5F);
        trucks[2] = new Truck("Praga", "V4S DKR", 16F);

        for (Truck i : trucks) System.out.println(i);
        System.out.println();
    }
}
