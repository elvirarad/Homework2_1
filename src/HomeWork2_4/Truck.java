package HomeWork2_4;

public final  class Truck extends Transport <DriverC> implements Competing{
    public Truck(String brand, String model, float engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
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
