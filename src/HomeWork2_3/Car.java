package HomeWork2_3;

import java.util.Objects;

public class Car extends Transport {

    float engineVolume;

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

    public Car (String brend, String model, int year, String country, String color, int maxSpeed) {
        super(brend, model, year, country, color, maxSpeed);

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
        return "Car{" + " объем двигателя = " + engineVolume + "л." + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineVolume);
    }
}
