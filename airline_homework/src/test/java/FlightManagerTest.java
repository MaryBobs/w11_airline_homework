import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Plane plane1;
    private Plane plane2;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.ATR72);
        plane2 = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane2,"FR756",AirportCode.EDI,AirportCode.LPL,"14:00");
        flightManager = new FlightManager(flight);
        passenger1 = new Passenger("Bruce",2);
        passenger2 = new Passenger("Steve",1);
        passenger3 = new Passenger("Adrian",2);
    }

    @Test
    public void hasPlane() {
        assertEquals(plane2, flightManager.getPlane());
    }

    @Test
    public void canCalculateBaggageWeightAllowancePerPassenger() {
        assertEquals(0.83, flightManager.calculateBaggageAllowancePerPerson(), 0.01);
    }

    @Test
    public void canCountPassengersBookedOntoFlight() {
        assertEquals(0, flightManager.countPassengers());
    }

    @Test
    public void canBookPassengerOntoFlight() {
        flightManager.bookPassenger(passenger1);
        assertEquals(1, flightManager.countPassengers());
    }

    @Test
    public void canCalculateBaggageWeightBookedByPassengers() {
        flightManager.bookPassenger(passenger1);
        flightManager.bookPassenger(passenger2);
        assertEquals(2.49, flightManager.calculateBookedBaggageWeight(), 0.01);
    }

    @Test
    public void canCalculateBaggageWeightRemaining() {
        flightManager.bookPassenger(passenger1);
        flightManager.bookPassenger(passenger2);
        assertEquals(2.51, flightManager.calculateBaggageWeightRemaining(), 0.01);
    }
}
