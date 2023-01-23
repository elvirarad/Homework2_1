package HomeWork2_6;

public class Main {
    public static void main(String[] args) throws DriversLicenseException {

    DriverB[] driverB = new DriverB[4];
    driverB[0] = new DriverB("Фернандо Алонсо", true, 9, "B");
    driverB[1] = new DriverB("Шарль Леклер", true, 11, "B");
    driverB[2] = new DriverB("Шумахер Михаэль", true, 13, "B");
    driverB[3] = new DriverB("Хэмилтон Льюис", true, 7, "B");

    DriverC[] driverC = new DriverC[4];
    driverC[0] = new DriverC("Дмитрий Сотников", true, 12, "C");
    driverC[1] = new DriverC("Руслан Ахмадеев", true, 11, "C");
    driverC[2] = new DriverC("Ильгиз Ахметзянов", true, 7, "C");
    driverC[3] = new DriverC("Радик Еникеев", true, 11, "C");

    DriverD[] driverD = new DriverD[4];
    driverD[0] = new DriverD("Михаил Коган", true, 16, "D");
    driverD[1] = new DriverD("Антон Храритонов", true, 15, "D");
    driverD[2] = new DriverD("Асто Маньяна", true, 13, "D");
    driverD[3] = new DriverD("Петр Дранго", true, 11, "D");


    System.out.println("          Легковые автомобили:");
    Car[] cars = new Car[4];
    cars[0] = new Car("Ford", "Focus RS WRC", 2F, driverB[0], BodyType.SEDAN);
    cars[1] = new Car("Opel", "Corsa", 2.1F, driverB[1], BodyType.HATCHBACK);
    cars[2] = new Car("Peugeot", "Sport", 2F, driverB[2], BodyType.PICKUP);
    cars[3] = new Car("Citroen", "C2", 2F, driverB[3], BodyType.CROSSOVER);

    for (Car i : cars) System.out.println(i);
    System.out.println();

    System.out.println("          Автобусы:");
    Bus[] buses = new Bus[4];
    buses[0] = new Bus("Икарус", "365", 5F, driverD[0], Capacity.EXTREMELY_SMALL);
    buses[1] = new Bus("ПАЗ", "Вектор NEXT 8.8", 4F, driverD[1], Capacity.SMALL);
    buses[2] = new Bus("ЛиАЗ", "6213", 6F, driverD[2], Capacity.EXTREMELY_LARGE);
    buses[3] = new Bus("НЕФАЗ", "4208-34", 11.7F, driverD[3], Capacity.EXTREMELY_LARGE);

    for (Bus i : buses) System.out.println(i);
    System.out.println();

    System.out.println("          Грузовые автомобили:");
    Truck[] trucks = new Truck[4];
    trucks[0] = new Truck("КАМАЗ", "4326", 16.2F, driverC[0], LoadCapacity.N2);
    trucks[1] = new Truck("МАЗ", "6440 RR", 12.5F, driverC[1], LoadCapacity.N1);
    trucks[2] = new Truck("Praga", "V4S DKR", 16F, driverC[2], LoadCapacity.N3);
    trucks[3] = new Truck("Tatra", "Phoenix", 1.9F, driverC[3], LoadCapacity.N1);

    for (Truck i : trucks) System.out.println(i);
    System.out.println();

    cars[0].startMoving();
    cars[1].startMoving();
    cars[2].startMoving();
    cars[3].startMoving();
    cars[0].finishTheMoving();
    cars[1].finishTheMoving();
    cars[3].finishTheMoving();
    cars[2].finishTheMoving();
    System.out.println();

    buses[0].startMoving();
    buses[1].startMoving();
    buses[2].startMoving();
    buses[3].startMoving();
    buses[0].finishTheMoving();
    buses[1].finishTheMoving();
    buses[2].finishTheMoving();
    buses[3].finishTheMoving();
    System.out.println();

    trucks[0].startMoving();
    trucks[1].startMoving();
    trucks[2].startMoving();
    trucks[3].startMoving();
    trucks[0].finishTheMoving();
    trucks[1].finishTheMoving();
    trucks[2].finishTheMoving();
    trucks[3].finishTheMoving();
    System.out.println();

    System.out.println("   Соревнуются легковые автомобили:");

    for (int i = 0; i < cars.length; i++) {
        System.out.print(cars[i].getBrand() + " " + cars[i].getModel() + " Пит-стоп: ");
        cars[i].getPitStop();
        System.out.print(cars[i].getBrand() + " " + cars[i].getModel() + " Лучшее время круга: ");
        cars[i].getBestLapTime();
        System.out.print(cars[i].getBrand() + " " + cars[i].getModel() + " Максимальная скорость: ");
        cars[i].getMaxSpeed();
    }
    System.out.println();

    System.out.println("   Соревнуются автобусы:");
    for (Bus bus : buses) {
        System.out.print(bus.getBrand() + " " + bus.getModel() + " Пит-стоп: ");
        bus.getPitStop();
        System.out.print(bus.getBrand() + " " + bus.getModel() + " Лучшее время круга: ");
        bus.getBestLapTime();
        System.out.print(bus.getBrand() + " " + bus.getModel() + " Максимальная скорость: ");
        bus.getMaxSpeed();
    }
    System.out.println();

    System.out.println("   Соревнуются грузовые автомобили:");
    for (Truck truck : trucks) {
        System.out.print(truck.getBrand() + " " + truck.getModel() + " Пит-стоп: ");
        truck.getPitStop();
        System.out.print(truck.getBrand() + " " + truck.getModel() + " Лучшее время круга: ");
        truck.getBestLapTime();
        System.out.print(truck.getBrand() + " " + truck.getModel() + " Максимальная скорость: ");
        truck.getMaxSpeed();
    }
    System.out.println();

    info(cars[0]);
    info(cars[1]);
    info(cars[2]);
    info(cars[3]);
    System.out.println();

    info(buses[0]);
    info(buses[1]);
    info(buses[2]);
    info(buses[3]);
    System.out.println();

    info(trucks[0]);
    info(trucks[1]);
    info(trucks[2]);
    info(trucks[3]);

    cars[0].printType();
    buses[1].printType();
    trucks[2].printType();

    Transport.checkDiagnosticsException(cars[1], trucks[0], buses[3]);
    try {
        driverB[1].setCategory("h");
    } catch (DriversLicenseException e){
        System.out.println("Произошла ошибка");
        System.out.println(e.getMessage());
    }
}
    private static void info(Transport<?> transport){
        System.out.println("водитель " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
    }
}
