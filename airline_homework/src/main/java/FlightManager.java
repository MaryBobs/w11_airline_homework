public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Plane getPlane() {
        return this.flight.getPlane();
    }
}
