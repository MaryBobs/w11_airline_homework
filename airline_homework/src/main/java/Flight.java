import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private AirportCode destination;
    private AirportCode departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, AirportCode destination, AirportCode departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int countPassengers() {
        return this.passengers.size();
    }

    public Plane getPlane() {
        return this.plane;
    }

    public PlaneType getPlaneType() {
        return this.plane.getType();
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public AirportCode getDestination() {
        return this.destination;
    }

    public AirportCode getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int countAvailableSeats() {
        return this.plane.getCapacity() - this.countPassengers();
    }

    public void bookPassenger(Passenger passenger) {
        if (this.plane.getCapacity() > this.countPassengers()) {
        this.passengers.add(passenger); }
    }

    public ArrayList<Passenger> getPassengerList() {
        return new ArrayList<Passenger>(this.passengers);
    }

}
