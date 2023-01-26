package lesson1;
import java.util.Objects;

public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    public void print(){
        System.out.println(brand + " " + model + ", " + year + " года выпуска, сборка: " + country + ", " + color + " цвет кузова, объем двигателя — " + engineVolume);
    }
    public Car(String brand, String model, String country, float engineVolume){
        this(brand, model, country, engineVolume, 2000);
    }

    public Car(String brand, String model, String country, float engineVolume, int year){
        switch (brand) {
            case "Lada":
                this.brand = "Lada";
                break;
            case "Audi":
                this.brand = "Audi";
                break;
            case "BMW":
                this.brand = "BMW";
                break;
            case "Kia":
                this.brand = "Kia";
                break;
            case "Hyundai":
                this.brand = "Hyundai";
                break;
            default:
                System.out.println("Неизвестный бренд: " + brand);
        }
        switch (model) {
            case "Granta":
                this.model = model;
                break;
            case "A8 50 L TDI quattro":
                this.model = model;
                break;
            case "Z8":
                this.model = model;
                break;
            case "Sportage 4-го поколения":
                this.model = model;
                break;
            case "Avante":
                this.model = model;
                break;
            default:
                System.out.println("Неизвестная модель: " + model);
        }

        switch (country) {
            case "Россия":
                this.country = country;
                break;
            case "Германия":
                this.country = country;
                break;
            case "Южная Корея":
                this.country = country;
                break;
            default:
                System.out.println("Неизвестная страна: " + country);
        }

        if (year >= 0){
            this.year = year;
        } else {
            this.year = 2000;
        }

        if ( color == null  || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (engineVolume > 0F){
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5F;
        }
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
