package HomeWork2_3;

public class Bus extends Transport {

    public Bus(String brand,
               String model,
               int year,
               String country,
               String color,
               int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Марка " + getBrand() +
                ", модель " + getModel() +
                ", сборка " + getCountry() + ", " +
                getYear() + "г.выпуска " +
                ", цвет кузова: " + getColor() +
                ", максимальная скорость передвижения - "+ getMaxSpeed() + " км/ч.;";
    }
}
