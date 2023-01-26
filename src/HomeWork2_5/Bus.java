package HomeWork2_5;

public final class Bus extends Transport<DriverD> implements Competing {
    private Capacity capacity;
    public Bus(String brand,
               String model,
               float engineVolume,
               DriverD driver,
               Capacity capacity) {
        super(brand, model, engineVolume, driver);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
    public void printType() {
        if (capacity == null){
            System.out.println("Данных по автобусу недостаточно");
        } else {
            System.out.println("Вместимость от " + capacity.getCapacityLowerLimit() + " до " +
                    capacity.getCapacityUpperLimit() + " мест.");
        }
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
