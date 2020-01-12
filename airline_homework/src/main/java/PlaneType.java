public enum PlaneType {
    BOEING747(6,10),
    AIRBUSA320(10,25),
    ATR72(2,5);

    private final int capacity;
    private final int totalWeight;

    private PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.totalWeight;
    }

}


