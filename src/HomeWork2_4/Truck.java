package HomeWork2_4;

public final  class Truck extends Transport{
    public Truck (String brand,
                  String model,
                  float engineVolume) {
        super(brand, model, engineVolume);
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
}
