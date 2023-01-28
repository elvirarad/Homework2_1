package HomeWork2_4;

public abstract class Driver {
    private String fullName;
    private boolean havingADriversLicense;
    private int experience;
    String hADriversLicense;

    public Driver(String fullName,
                  boolean havingADriversLicense,
                  int experience) {
        this.fullName = TransportService.isCorrectStringType(fullName);
        this.havingADriversLicense = havingADriversLicense;
        this.experience = TransportService.isCorrectIntType(experience);

        if (havingADriversLicense) {
            hADriversLicense = "имеются";
        } else hADriversLicense = "нет";
        }

    public String getFullName() {
        return fullName;
    }

    /*public boolean havingADriversLicense() {
        return havingADriversLicense;
    }*/

    public int getExperience() {
        return experience;
    }

    /*public String gethADriversLicense() {
        return hADriversLicense;
    }*/

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
