package HomeWork2_4;

public class Main {
    public static void main(String[] args) {

        System.out.println("          Легковые автомобили:");
        Car[] cars = new Car[4];
        cars[0] = new Car("Ford", "Focus RS WRC", 2F);
        cars[1] = new Car("Opel", "Corsa", 2.1F);
        cars[2] = new Car("Peugeot", "Sport", 2F);
        cars[3] = new Car("Citroen", "C2", 2F);

        for (Car i : cars) System.out.println(i);
        System.out.println();

        System.out.println("          Автобусы:");
        Bus[] buses = new Bus[4];
        buses[0] = new Bus("Икарус", "365", 5F);
        buses[1] = new Bus("ПАЗ", "Вектор NEXT 8.8", 4F);
        buses[2] = new Bus("ЛиАЗ", "6213", 6F);
        buses[3] = new Bus("НЕФАЗ", "4208-34", 11.7F);

        for (Bus i : buses) System.out.println(i);
        System.out.println();

        System.out.println("          Грузовые автомобили:");
        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("КАМАЗ", "4326", 16.2F);
        trucks[1] = new Truck("МАЗ", "6440 RR", 12.5F);
        trucks[2] = new Truck("Praga", "V4S DKR", 16F);
        trucks[3] = new Truck("Tatra", "Phoenix", 1.9F);

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
        for (Car car : cars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " Пит-стоп: " + car.getPitStop());
            System.out.println(car.getBrand() + " " + car.getModel() + " Лучшее время круга: " + car.getBestLapTime());
            System.out.println(car.getBrand() + " " + car.getModel() + " Максимальная скорость: " + car.getMaxSpeed());
        }
        System.out.println();

        System.out.println("   Соревнуются автобусы:");
        for (Bus bus : buses) {
            System.out.println(bus.getBrand() + " " + bus.getModel() + " Пит-стоп: " + bus.getPitStop());
            System.out.println(bus.getBrand() + " " + bus.getModel() + " Лучшее время круга: " + bus.getBestLapTime());
            System.out.println(bus.getBrand() + " " + bus.getModel() + " Максимальная скорость: " + bus.getMaxSpeed());
        }
        System.out.println();

        System.out.println("   Соревнуются грузовые автомобили:");
        for (Truck truck : trucks) {
            System.out.println(truck.getBrand() + " " + truck.getModel() + " Пит-стоп: " + truck.getPitStop());
            System.out.println(truck.getBrand() + " " + truck.getModel() + " Лучшее время круга: " + truck.getBestLapTime());
            System.out.println(truck.getBrand() + " " + truck.getModel() + " Максимальная скорость: " + truck.getMaxSpeed());
        }
        System.out.println();
    }
}
