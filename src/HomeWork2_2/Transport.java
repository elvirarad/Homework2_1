package HomeWork2_2;

import java.util.Objects;
import java.time.LocalDate;

public class Transport {

        final String brand;
        private String model;
        private final float engineVolume;
        String color;
        private final int year;
        private String country;
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
            this.transmission = transmission;
            this.bodyType = bodyType;
            this.registrationNumber = registrationNumber;
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

        private boolean isCorrectStringType(String object) {
            if (object.equals("") && object != null) {
                return true;
            }
            return false;
        }

/*    public static void changeTiresToSeason() {
        int month = LocalDate.now().getMonthValue();
        switch (month){
            case 1:
            case 2:
            case 3:
            case 10:
            case 11:
            case 12:
                this.summerOrWinterTires = false;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                this.summerOrWinterTires = true;
                break;
        }

    }*/

        @Override
        public String toString() {
            return brand + model + year + country + color + engineVolume + transmission + bodyType + registrationNumber + numberOfSeats + summerOrWinterTires;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            lesson1.Transport transport = (lesson1.Transport) o;
            return Float.compare(transport.engineVolume, engineVolume) == 0 && year == transport.year && numberOfSeats == transport.numberOfSeats && summerOrWinterTires == transport.summerOrWinterTires && brand.equals(transport.brand) && model.equals(transport.model) && color.equals(transport.color) && country.equals(transport.country) && transmission.equals(transport.transmission) && bodyType.equals(transport.bodyType) && registrationNumber.equals(transport.registrationNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hash(brand, model, engineVolume, color, year, country, transmission, bodyType, registrationNumber, numberOfSeats, summerOrWinterTires);
        }
    }

