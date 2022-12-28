package HomeWork2_4;

public class Bus extends Transport{
    public Bus(String brand,
               String model,
               float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Марка " + getBrand() +
                ", модель " + getModel() +
                " объем двигателя = " + getEngineVolume() + "л.";
    }
}
