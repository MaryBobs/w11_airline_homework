import java.util.Random;
import java.util.stream.IntStream;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Plane getPlane() {
        return this.flight.getPlane();
    }

    public double getTotalBaggageWeight() {
        return ((double)this.flight.getPlane().getWeight() / 2);
    }

    public double calculateBaggageAllowancePerPerson() {
        this.flight.getPlane().getCapacity();
        return this.getTotalBaggageWeight() / this.flight.getPlane().getCapacity();
    }

    public int countPassengers() {
        return this.flight.countPassengers();
    }

    public void bookPassenger(Passenger passenger) {
        this.flight.bookPassenger(passenger);
        passenger.addFlight(this.flight);
    }

   public double calculateBookedBaggageWeight() {
        double totalBaggage = 0;
        for (Passenger passenger : this.flight.getPassengerList()) {
            double baggage = passenger.countBags() * this.calculateBaggageAllowancePerPerson();
            totalBaggage += baggage;
       }
        return totalBaggage;
    }

    public double calculateBaggageWeightRemaining() {
        return this.getTotalBaggageWeight() - this.calculateBookedBaggageWeight();
    }


}
