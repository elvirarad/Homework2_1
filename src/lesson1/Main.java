package lesson1;

public class Main {
    public static void main(String[] args) {
        //Car car = new Car();
        //car.name = "LadaGranta";
        Car ladaGranta = new Car();
        ladaGranta.brand = "Lada";
        ladaGranta.model = "Granta";
        ladaGranta.engineVolume = 1.7;
        ladaGranta.color = "жёлтый";
        ladaGranta.year = 2015;
        ladaGranta.country = "Россия";
        ladaGranta.print();

        Car audiA8 = new Car();
        audiA8.brand = "Audi";
        audiA8.model = "A8 50 L TDI quattro";
        audiA8.engineVolume = 3.0;
        audiA8.color = "черный";
        audiA8.year = 2020;
        audiA8.country = "Германия";
        audiA8.print();

        Car bmwZ8 = new Car();
        bmwZ8.brand = "BMW";
        bmwZ8.model = "Z8";
        bmwZ8.engineVolume = 3.0;
        bmwZ8.color = "черный";
        bmwZ8.year = 2021;
        bmwZ8.country = "Германия";
        bmwZ8.print();

        Car kiaSportage = new Car();
        kiaSportage.brand = "Kia";
        kiaSportage.model = "Sportage 4-го поколения";
        kiaSportage.engineVolume = 2.4;
        kiaSportage.color = "красный";
        kiaSportage.year = 2018;
        kiaSportage.country = "Южная Корея";
        kiaSportage.print();

        Car hyundaiAvante = new Car();
        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.engineVolume = 1.6;
        hyundaiAvante.color = "оранжевый";
        hyundaiAvante.year = 2016;
        hyundaiAvante.country = "Южная Корея";
        hyundaiAvante.print();

    }

}
