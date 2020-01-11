public enum PlaneType {
    BOEING747(6,12),
    AIRBUSA320(10,20),
    ATR72(2,4);

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


