package HomeWork2_4;

import java.util.Objects;

public class Car extends Transport{
    private float engineVolume;

    public Car (String brand,
                String model,
                float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return getBrand() +
                " " + getModel() +
                ", объем двигателя = " + getEngineVolume() + "л.";
    }
}
