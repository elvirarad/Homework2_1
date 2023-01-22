package HomeWork2_6;

public enum LoadCapacity {
    N1(0D,3.5),
    N2(3.5, 12D),
    N3(12D, null);

    private final Double LowerLimit;
    private final Double UpperLimit;

    LoadCapacity(Double lowerLimit, Double upperLimit) {
        LowerLimit = lowerLimit;
        UpperLimit = upperLimit;
    }

    public Double getLowerLimit() {
        return LowerLimit;
    }

    public Double getUpperLimit() {
        return UpperLimit;
    }
}
