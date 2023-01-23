package HomeWork2_6.driver;

public final class DriverC extends Driver {
    public DriverC (String fullName,
                    boolean havingADriversLicense,
                    int experience,
                    String category) throws DriversLicenseException {
        super(fullName, havingADriversLicense, experience, category);
    }
    @Override
    public void startMoving(){
    };

    @Override
    public void finishTheMoving(){};

    @Override
    public void refuelTheCar(){};

}
