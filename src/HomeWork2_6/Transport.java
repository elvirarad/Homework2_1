package HomeWork2_6;

import java.util.Objects;

public abstract class Transport <T extends Driver>{
    private final String brand;
    private final String model;
    private float engineVolume;
    private final T driver; // реализуем дженерик

    public Transport(String brand,
                     String model,
                     float engineVolume,
                     T driver) {
        this.brand = TransportService.isCorrectStringType(brand);
        this.model = TransportService.isCorrectStringType(model);
        if (engineVolume > 0F){
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5F;
        }
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public T getDriver() {
        return driver;
    }

    public String getModel() {
        return model;
    }
    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public abstract void startMoving();

    public abstract void finishTheMoving();

    public abstract void printType();

    public abstract void passDiagnostics();
    public static void checkDiagnosticsException(Transport... transports){
        for (Transport transport : transports) {
            try {
                transport.passDiagnostics();
            } catch (UnsupportedOperationException e) {
                System.out.println("Произошла ошибка");
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return brand + " " + model +
                ", объем двигателя = "  + engineVolume + "л.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

}
