package HomeWork2_9.driver;

import HomeWork2_9.transport.TransportService;

public abstract class Driver {
    private String fullName;
    private boolean havingADriversLicense;
    private int experience;
    String hADriversLicense;
    private String category;

    public Driver(String fullName,
                  boolean havingADriversLicense,
                  int experience,
                  String category) throws DriversLicenseException {
        this.fullName = TransportService.isCorrectStringType(fullName);
        this.havingADriversLicense = havingADriversLicense;
        this.experience = TransportService.isCorrectIntType(experience);

        if (havingADriversLicense) {
            hADriversLicense = "имеются";
        } else hADriversLicense = "нет";
        setCategory(category);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) throws DriversLicenseException {
        if (category == null || category.isEmpty()) {
            throw new DriversLicenseException(" категория прав не определена для водителя " + getFullName());
        } else if (category.equals("B") || category.equals("C") || category.equals("D")) {
            this.category = category;
        } else {
            throw new DriversLicenseException(" категория прав не определена для водителя " + getFullName());
        }
    }

    public String getFullName() {
        return fullName;
    }

    public int getExperience() {
        return experience;
    }


    public void setHavingADriversLicense(boolean havingADriversLicense) {
        this.havingADriversLicense = havingADriversLicense;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMoving();
    public abstract void finishTheMoving();
    public abstract void refuelTheCar();

    @Override
    public String toString() {
        return "Driver{" +
                "ФИО: " + fullName + ' ' +
                ", Наличие водительских прав: " + hADriversLicense  +
                ", Стаж: " + experience +
                '}';
    }
}
