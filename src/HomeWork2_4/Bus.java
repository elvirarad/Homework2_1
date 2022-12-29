package HomeWork2_4;

public final class Bus extends Transport{
    public Bus(String brand,
               String model,
               float engineVolume) {
        super(brand, model, engineVolume);
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
}
