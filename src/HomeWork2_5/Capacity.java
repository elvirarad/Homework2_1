package HomeWork2_5;

public enum Capacity {
    EXTREMELY_SMALL(0,10),
    SMALL(10,25),
    MEDIUM(40,50),
    LARGE(60,80),
    EXTREMELY_LARGE(100,120);

    private final Integer CapacityLowerLimit;
    private final Integer CapacityUpperLimit;

    Capacity(Integer capacityLowerLimit, Integer capacityUpperLimit) {
        CapacityLowerLimit = capacityLowerLimit;
        CapacityUpperLimit = capacityUpperLimit;
    }

    public Integer getCapacityLowerLimit() {
        return CapacityLowerLimit;
    }

    public Integer getCapacityUpperLimit() {
        return CapacityUpperLimit;
    }
}
