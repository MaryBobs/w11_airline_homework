public enum PlaneType {
    BOEING747(6),
    AIRBUSA320(10),
    ATR72(2);

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


