package HomeWork2_4;

public final class DriverD extends Driver{
    public DriverD (String fullName,
                    boolean havingADriversLicense,
                    int experience){
        super(fullName, havingADriversLicense, experience);
    }

    @Override
    public void startMoving(){
        /*System.out.println("1. " + getBrand() + " " + getModel() + " Включею зажигание");
        System.out.println("2. На старте " );
        System.out.println("3. Стартую");*/
    };

    @Override
    public void finishTheMoving(){};

    @Override
    public void refuelTheCar(){};
}
