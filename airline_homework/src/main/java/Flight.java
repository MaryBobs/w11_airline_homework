import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private AirportCode destination;
    private AirportCode departureAirport;
    private String depatureTime;

    public Flight(Plane plane, String flightNumber, AirportCode destination, AirportCode departureAirport, String depatureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.depatureTime = depatureTime;
    }

    public int countPassengers() {
        return this.passengers.size();
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
        return this.depatureTime;
    }
}
