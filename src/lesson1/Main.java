package lesson1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", "Россия", 1.7F, 2015);
        ladaGranta.color = "жёлтый";
        ladaGranta.print();

        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", "Германия", 3.0F);
        audiA8.color = "черный";
        audiA8.year = 2020;
        audiA8.print();

        Car bmwZ8 = new Car("BMW", "Z8", "Германия", 3F);
        bmwZ8.color = "черный";
        bmwZ8.year = 2021;
        bmwZ8.print();

        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", "Южная Корея", 2.4F);
        kiaSportage.color = "красный";
        kiaSportage.print();

        Car hyundaiAvante = new Car("Hyundai", "Avante", "Южная Корея", 01.6F, 2016);
        hyundaiAvante.print();

    }
}
