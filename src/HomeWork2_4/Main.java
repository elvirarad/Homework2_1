package HomeWork2_4;

public class Main {
    public static void main(String[] args) {

        System.out.println("          Объекты класса Car:");
        Car[] cars = new Car[5];
        cars[0] = new Car("Lada", "Granta", 2015, "Россия", "желтый", 190,1.7F);
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 2020,"Германия", "черный",250, 3.0F  );
        cars[2] = new Car("BMW", "Z8", 2021, "Германия", "черный",300,3F);
        cars[3] = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный",280, 2.4F);
        cars[4] = new Car("Hyundai", "Avante", 2016,"Южная Корея", "оранжевый",220,1.6F);

        for (Car i :cars) System.out.println(i);
        System.out.println();

        System.out.println("          Объекты класса Bas:");
        Bus[] buses = new Bus[3];
        buses[0] = new Bus("Икарус", "365", 2010, "Венгрия", "красный", 110);
        buses[1] = new Bus("ПАЗ", "Вектор NEXT 8.8", 2022, "Россия", "голубой", 100);
        buses[2] = new Bus("ЛиАЗ", "6213", 2020, "Россия", "белый", 90);

        for (Bus i : buses) System.out.println(i);

    }
}
