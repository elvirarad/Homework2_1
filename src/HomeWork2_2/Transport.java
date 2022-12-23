package HomeWork2_2;

import java.util.Objects;
import java.time.LocalDate;

public class Transport {

        private final String brand;
        private final String model;
        private float engineVolume;
        String color;
        private final int year;
        private final String country;
        String transmission;
        private final String bodyType;
        String registrationNumber;
        private final int numberOfSeats;
        boolean summerOrWinterTires;

        public void print() {
            String rezina;
            if (summerOrWinterTires) {
                rezina = "летняя";
            } else {
                rezina = "зимняя";
            }
            System.out.println(brand + " " + model + ", " + year + " года выпуска, сборка: " + country + ", " + color + " цвет кузова, объем двигателя — " + engineVolume + ", " + transmission + ", " + bodyType + ", рег.№ " + registrationNumber + ", количество мест: " + numberOfSeats + ", резина " + rezina + ";");
        }

        public Transport(String brand, String model, String country, float engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean summerOrWinterTires) {
            this(brand, model, country, engineVolume, 2000, "белый", transmission, bodyType, registrationNumber, numberOfSeats, summerOrWinterTires);
        }

        public Transport(String brand, String model, String country, float engineVolume, int year, String color, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean summerOrWinterTires) {
            this.brand = isCorrectStringType(brand);
            this.model = isCorrectStringType(model);
            this.country = isCorrectStringType(country);

            if (year >= 0) {
                this.year = year;
            } else {
                this.year = 2000;
            }

            if (color == null || color.isEmpty()) {
                this.color = "белый";
            } else {
                this.color = color;
            }

            if (engineVolume > 0F) {
                this.engineVolume = engineVolume;
            } else {
                this.engineVolume = 1.5F;
            }
            this.transmission = isCorrectStringType(transmission);
            this.bodyType = isCorrectStringType(bodyType);
            this.registrationNumber = isCorrectStringType(registrationNumber);
            this.numberOfSeats = numberOfSeats;
            this.summerOrWinterTires = summerOrWinterTires;
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

        public String getColor() {
            return color;
        }

        public int getYear() {
            return year;
        }

        public String getCountry() {
            return country;
        }

        public String getTransmission() {
            return transmission;
        }

        public String getBodyType() {
            return bodyType;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        public boolean isSummerOrWinterTires() {
            return summerOrWinterTires;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setTransmission(String transmission) {
            this.transmission = transmission;
        }

        public void setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
        }

        public void setSummerOrWinterTires(boolean summerOrWinterTires) {
            this.summerOrWinterTires = summerOrWinterTires;
        }

        private String isCorrectStringType(String object) {
            if (!object.equals("")) {
                if (!object.isBlank()) {
                    return object;
                }
            }
            return "default ";
        }

    public void changeTiresToSeason() {
        int month = LocalDate.now().getMonthValue();
        this.summerOrWinterTires = (month >= 4) && (month <= 9);
    }

        @Override
        public String toString() {
            return brand + model + year + country + color + engineVolume + transmission + bodyType + registrationNumber + numberOfSeats + summerOrWinterTires;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            HomeWork2_2.Transport transport = (HomeWork2_2.Transport) o;
            return Float.compare(transport.engineVolume, engineVolume) == 0 && year == transport.year && numberOfSeats == transport.numberOfSeats && summerOrWinterTires == transport.summerOrWinterTires && brand.equals(transport.brand) && model.equals(transport.model) && color.equals(transport.color) && country.equals(transport.country) && transmission.equals(transport.transmission) && bodyType.equals(transport.bodyType) && registrationNumber.equals(transport.registrationNumber);
        }


        @Override
        public int hashCode() {
            return Objects.hash(brand, model, engineVolume, color, year, country, transmission, bodyType, registrationNumber, numberOfSeats, summerOrWinterTires);
        }
    }

