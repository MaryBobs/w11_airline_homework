import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.ATR72);
        flight = new Flight(plane,"FR756",AirportCode.EDI,AirportCode.LPL,"14:00");
    }

    @Test
    public void passengerListStartsEmpty() {
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void hasPlane() {
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
    public void hasDepatureTime() {
        assertEquals("14:00", flight.getDepartureTime());
    }
}
