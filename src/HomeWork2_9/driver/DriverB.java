package HomeWork2_9.driver;

public final class DriverB extends Driver {
    public DriverB (String fullName,
                    boolean havingADriversLicense,
                    int experience,
                    String category) throws DriversLicenseException {
        super(fullName, havingADriversLicense, experience, category);
    }
    @Override
    public void startMoving(){};

    @Override
    public void finishTheMoving(){};

    @Override
    public void refuelTheCar(){};
}
