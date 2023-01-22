package HomeWork2_6;

public final class DriverB extends Driver {
    public DriverB (String fullName,
                    boolean havingADriversLicense,
                    int experience){
        super(fullName, havingADriversLicense, experience);
    }
    @Override
    public void startMoving(){};

    @Override
    public void finishTheMoving(){};

    @Override
    public void refuelTheCar(){};
}
