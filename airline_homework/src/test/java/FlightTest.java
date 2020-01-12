import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @Before
    public void before() {
        plane = new Plane(PlaneType.ATR72);
        flight = new Flight(plane,"FR756",AirportCode.EDI,AirportCode.LPL,"14:00");
        passenger1 = new Passenger("Bruce",2);
        passenger2 = new Passenger("Steve",1);
        passenger3 = new Passenger("Adrian",2);
    }

    @Test
    public void passengerListStartsEmpty() {
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.ATR72, flight.getPlaneType());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals(AirportCode.EDI, flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals(AirportCode.LPL, flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("14:00", flight.getDepartureTime());
    }

    @Test
    public void canReturnNumberOfAvailableSeatsWhenEmpty() {
        assertEquals(2, flight.countAvailableSeats());
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.countAvailableSeats());
    }

    @Test
    public void canNotBookPassengerIfFlightFull() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        assertEquals(2, flight.countPassengers());
    }

    @Test
    public void canReturnPassengerList() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(2, flight.getPassengerList());
    }

}
