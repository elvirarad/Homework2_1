package HomeWork2_3;

import java.util.Objects;

public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    public static class Key{
        private final boolean remoteEngineStart;
        private final boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
            // проверять данные не вижу смысла, т.к. в типе boolean возможны только 2 значения : true / false
            // в единственном конструкторе указаны оба поля и при введении значения отличный от true и false Java  будет выдавать ошибку
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }
    }

    public void print(){
        System.out.println(brand + " " + model + ", " + year + " года выпуска, сборка: " + country + ", " + color + " цвет кузова, объем двигателя — " + engineVolume);
    }
    public Car(String brand, String model, String country, float engineVolume){
        this(brand, model, country, engineVolume, 2000);
    }

    public Car(String brand, String model, String country, float engineVolume, int year){
        this.brand = TransportService.isCorrectStringType(brand);
        this.model = TransportService.isCorrectStringType(model);
        this.country = TransportService.isCorrectStringType(country);
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
