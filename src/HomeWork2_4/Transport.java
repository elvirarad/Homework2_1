package HomeWork2_4;
import java.util.Objects;

public abstract class Transport implements Competing{
    private String brand;
    private String model;
    private float engineVolume;

    public Transport(String brand,
                     String model,
                     float engineVolume) {
        this.brand = TransportService.isCorrectStringType(brand);
        this.model = TransportService.isCorrectStringType(model);
        if (engineVolume > 0F){
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5F;
        }
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public float getEngineVolume() {
        return engineVolume;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String getPitStop() {
        return "пит-стоп";
    }

    @Override
    public int getBestLapTime() {
        return 300;
    }

    @Override
    public int getMaxSpeed() {
        return 280;
    }

    public abstract void startMoving();

    public abstract void finishTheMoving();

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
