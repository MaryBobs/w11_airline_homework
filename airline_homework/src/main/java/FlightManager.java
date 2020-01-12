public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Plane getPlane() {
        return this.flight.getPlane();
    }


    public double calculateBaggageAllowancePerPerson() {
        this.flight.getPlane().getCapacity();
        return ((double)this.flight.getPlane().getWeight() / 2) / this.flight.getPlane().getCapacity();
    }
}
