package lesson1;
import java.util.Objects;

public class Car {
    //String name;
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public void print(){
        System.out.println(brand + " " + model + ", " + year + " года выпуска, сборка: " + country + ", " + color + " цвет кузова, объем двигателя — " + engineVolume);
    }
    public Car(String brand, String model){
        this(brand, model, 2016);
    }

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
        engineVolume = 0.7;
        color = "черный";
        country = "Южная Корея";
    }

    @Override
    public String toString() {
        return brand +  model + year  + country + color + engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && year == car.year && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color) && country.equals(car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country);
    }
}
