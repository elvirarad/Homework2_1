package HomeWork2_4;

import java.util.Objects;

public final class Car extends Transport <DriverB> implements Competing {

    public Car(String brand,
               String model,
               float engineVolume,
               DriverB driver) {
        super(brand, model, engineVolume, driver);
    }
    //DriverB driver - новая переменная

    @Override
    public void startMoving(){
        System.out.println("1. " + getBrand() + " " + getModel() + " Включею зажигание");
        System.out.println("2. На старте " );
        System.out.println("3. Стартую");
    }

    @Override
    public void finishTheMoving(){
        System.out.println("1." + getBrand() + " "+ getModel()+ " финишировал");
    }

    @Override
    public String toString() {
        return getBrand() +
                " " + getModel() +
                ", объем двигателя = " + getEngineVolume() + "л.";
    }

    @Override
    public void getPitStop() {
        System.out.println("проводим PitStop автомобиля");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("лучшее время автомобиля");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("максимальная скорость автомобиля");
    }
}
