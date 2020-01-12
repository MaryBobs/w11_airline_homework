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

    public int countPassengers() {
        return this.flight.countPassengers();
    }

    public void bookPassenger(Passenger passenger) {
        this.flight.bookPassenger(passenger);
    }

   public double calculateBookedBaggageWeight() {
        double totalBaggage = 0;
        for (Passenger passenger : this.flight.getPassengerList()) {
            double baggage = passenger.countBags() * this.calculateBaggageAllowancePerPerson();
            totalBaggage += baggage;
       }
        return totalBaggage;
    }
}
