import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Plane plane1;
    private Plane plane2;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.ATR72);
        plane2 = new Plane(PlaneType.ATR72);
        flight = new Flight(plane1,"FR756",AirportCode.EDI,AirportCode.LPL,"14:00");
        flightManager = new FlightManager(flight);
    }

    @Test
    public void hasPlane() {
        assertEquals(plane1, flightManager.getPlane());
    }
}
