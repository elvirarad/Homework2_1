package HomeWork2_9.transport;

public class Mechanic {
    private String name;
    private String company;
    private TransportType transportType;

    public Mechanic(String name, String company, TransportType transportType) {
        this.name = name;
        this.company = company;
        this.transportType = transportType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public TransportType getType() {
        return transportType;
    }

    public void carryOutMaintenance (){
        System.out.println(getName() + " из компании " + getCompany() + " проводит техобслуживание.");
    }

    public void fixTheCar (){
        System.out.println(getName() + " из компании " + getCompany() + " чинит машину.");
    }

    @Override
    public String toString() {
        return name +
                ", компания: " + company +
                " ремонтирует: " + transportType;
    }
}
