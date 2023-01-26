package HomeWork2_5;

public final class DriverC extends Driver {
    public DriverC (String fullName,
                    boolean havingADriversLicense,
                    int experience){
        super(fullName, havingADriversLicense, experience);
    }
    @Override
    public void startMoving(){
    };

    @Override
    public void finishTheMoving(){};

    @Override
    public void refuelTheCar(){};
}
