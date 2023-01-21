package HomeWork2_5;

public final class Bus extends Transport<DriverD> implements Competing {
    public Bus(String brand,
               String model,
               float engineVolume,
               DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving(){
        System.out.println("1. На старте автобус " + getBrand() + getModel());
        System.out.println("2. Стартую");
    }

    @Override
    public void finishTheMoving(){
        System.out.println("1." + getBrand() + " "+ getModel()+ " приближаюсь к финишу");
        System.out.println("2. пересекаю финишную линию ");
        System.out.println("3. финиширую");
    }

    @Override
    public String toString() {
        return getBrand() +
                " " + getModel() +
                ", объем двигателя = " + getEngineVolume() + "л.";
    }

    @Override
    public void getPitStop() {
        System.out.println("проводим PitStop для автобуса");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("лучшее время автобуса");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("максимальная скорость автобуса");
    }
}
