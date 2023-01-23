package HomeWork2_6.transport;

import HomeWork2_6.driver.DriverC;
import HomeWork2_6.transport.Competing;
import HomeWork2_6.transport.LoadCapacity;
import HomeWork2_6.transport.Transport;

public final  class Truck extends Transport<DriverC> implements Competing {

    private LoadCapacity loadCapacity;
    public Truck(String brand,
                 String model,
                 float engineVolume,
                 DriverC driver,
                 LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMoving(){
        System.out.println("1. На старте грузовик " + getBrand() + getModel());
        System.out.println("2. Стартую");
    }

    @Override
    public void finishTheMoving(){
        System.out.println("1. Грузовик " + getBrand() + " "+ getModel()+ " финишировал");
    }

    @Override
    public void printType() {
        if (loadCapacity == null){
            System.out.println("Данных по грузовику недостаточно");
        } else {
            String loadCapacityLowerLimit = loadCapacity.getLowerLimit() == null ? "" : "от " +
                    loadCapacity.getLowerLimit() + " тонн";
            String loadCapacityUpperLimit = loadCapacity.getUpperLimit() == null ? "" : " до " +
                    loadCapacity.getUpperLimit() + " тонн";
            // третичный оператор
            System.out.println("Грузоподъемность: " + loadCapacityLowerLimit + loadCapacityUpperLimit);
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Проходит диагностику грузовик " + getBrand() + " " + getModel());
    }

    @Override
    public String toString() {
        return getBrand() +
                " " + getModel() +
                ", объем двигателя = " + getEngineVolume() + "л.";
    }

    @Override
    public void getPitStop() {
        System.out.println("проводим PitStop для грузовика");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("лучшее время грузовика");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("максимальная скорость грузовика");
    }
}
