import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;
    private Flight flight1;
    private Plane plane;

    @Before
    public void before() {
        passenger = new Passenger("Bruce", 2);
        plane = new Plane(PlaneType.ATR72);
        flight1 = new Flight(plane,"FR756",AirportCode.EDI,AirportCode.LPL,"14:00");
    }

    @Test
    public void hasName() {
        assertEquals("Bruce", passenger.getName());
    }

    @Test
    public void hasNumberOfBags() {
        assertEquals(2, passenger.countBags());
    }

    @Test
    public void canAddFlight() {
        passenger.addFlight(flight1);
        assertEquals(flight1, passenger.getFlight());
    }

    @Test
    public void seatNumberStartsAtNull() {
        assertEquals(0, passenger.getSeat());
    }

    @Test
    public void canAddSeat() {
        int number = 2;
        passenger.addSeat(number);
        assertEquals(2, passenger.getSeat());
    }
}
