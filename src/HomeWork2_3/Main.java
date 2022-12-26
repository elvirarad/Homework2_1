package HomeWork2_3;


public class Main {
    public static void main(String[] args) {

        Transport[] transport = new Transport[5];
        transport[0] = new Transport("Lada",
                "Granta",
                2015,
                "Россия",
                "желтый",
                190);
        transport[1] = new Transport("Audi",
                "A8 50 L TDI quattro",
                2020,
                "Германия",
                "черный",
                250);
        transport[2] = new Transport("BMW",
                "Z8",
                2021,
                "Германия",
                "черный",
                280);
        transport[3] = new Transport("Kia",
                "Sportage 4-го поколения",
                2018,
                "Южная Корея",
                "красный",
                230);
        transport[4] = new Transport("Hyundai",
                "Avante",
                2016,
                "Южная Корея",
                "оранжевый",
                200);

        for (Transport i : transport) System.out.println(i);
        System.out.println();

        Car[] cars = new Car[5];
        cars[0] = new Car(transport[0].getBrand(),
                transport[0].getModel(),
                transport[0].getYear(),
                transport[0].getCountry(),
                transport[0].getColor(),
                transport[0].getMaxSpeed(),
                1.7f);
        cars[1] = new Car(transport[1].getBrand(),
                transport[1].getModel(),
                transport[1].getYear(),
                transport[1].getCountry(),
                transport[1].getColor(),
                transport[1].getMaxSpeed(),
                3f);
        cars[2] = new Car(transport[2].getBrand(),
                transport[2].getModel(),
                transport[2].getYear(),
                transport[2].getCountry(),
                transport[2].getColor(),
                transport[2].getMaxSpeed(),
                3f);
        cars[3] = new Car(transport[3].getBrand(),
                transport[3].getModel(),
                transport[3].getYear(),
                transport[3].getCountry(),
                transport[3].getColor(),
                transport[3].getMaxSpeed(),
                2.4f);
        cars[4] = new Car(transport[4].getBrand(),
                transport[4].getModel(),
                transport[4].getYear(),
                transport[4].getCountry(),
                transport[4].getColor(),
                transport[4].getMaxSpeed(),
                1.6f);


        for (Car i :cars) System.out.println(i);

    }
}