package HomeWork2_4;
import java.time.LocalDate;
import java.util.Objects;

public class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, String country, int maxSpeed) {
        this(brand, model, 2000, country,  "белый", maxSpeed);
    }

    public Transport(String brand,
                     String model,
                     int year,
                     String country,
                     String color,
                     int maxSpeed) {
        this.brand = TransportService.isCorrectStringType(brand);
        this.model = TransportService.isCorrectStringType(model);

        if (year >= 0 || year <= LocalDate.now().getYear()) {
            this.year = year;
        } else {
            this.year = 2000;
        }

        this.country = TransportService.isCorrectStringType(country);

        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        this.maxSpeed = TransportService.isCorrectIntType(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getCountry() {
        return country;
    }
    public int getMaxSpeed() { return maxSpeed; }

    public void setColor(String color) {
        this.color = TransportService.isCorrectStringType(color);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = TransportService.isCorrectIntType(maxSpeed);
    }

    @Override
    public String toString() {
        return "Марка " + brand +
                ", модель " + model +
                ", сборка " + country + ", " +
                year + "г.выпуска " +
                ", цвет кузова: " + color +
                ", максимальная скорость передвижения - "+ maxSpeed + " км/ч.;";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && maxSpeed == transport.maxSpeed && brand.equals(transport.brand) && model.equals(transport.model) && country.equals(transport.country) && color.equals(transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color, maxSpeed);
    }
}
