package HomeWork2_4;

import java.util.Objects;

public class Car extends Transport{
    private float engineVolume;

    public Car (String brand,
                String model,
                int year,
                String country,
                String color,
                int maxSpeed,
                float engineVolume) {
        super(brand, model, year, country, color, maxSpeed);

        if (engineVolume > 0F){
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5F;
        }

    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Марка " + getBrand() +
                ", модель " + getModel() +
                ", сборка " + getCountry() + ", " +
                getYear() + "г.выпуска " +
                ", цвет кузова: " + getColor() +
                ", максимальная скорость передвижения - "+ getMaxSpeed() + " км/ч.;" +
                " объем двигателя = " + engineVolume + "л.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineVolume);
    }
}
