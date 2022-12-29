package HomeWork2_4;

import java.util.Objects;

public final class Car extends Transport{

    public Car (String brand,
                String model,
                float engineVolume) {
        super(brand, model, engineVolume);
    }

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
}
