package lesson1;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada","Granta", 2015);
        ladaGranta.engineVolume = 1.7;
        ladaGranta.color = "жёлтый";
        ladaGranta.country = "Россия";
        ladaGranta.print();

        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro");
        audiA8.engineVolume = 3.0;
        audiA8.color = "черный";
        audiA8.year = 2020;
        audiA8.country = "Германия";
        audiA8.print();

        Car bmwZ8 = new Car("BMW", "Z8");
        bmwZ8.engineVolume = 3.0;
        bmwZ8.color = "черный";
        bmwZ8.year = 2021;
        bmwZ8.print();

        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения");
        kiaSportage.engineVolume = 2.4;
        kiaSportage.color = "красный";
        kiaSportage.print();

        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016);
        hyundaiAvante.country = "Южная Корея";
        hyundaiAvante.print();

    }
}
