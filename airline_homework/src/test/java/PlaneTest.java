import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;
    private Plane plane2;

    @Before
    public void before() {
        plane = new Plane(PlaneType.ATR72);
        plane2 = new Plane(PlaneType.AIRBUSA320);
    }

    @Test
    public void hasType() {
        assertEquals(PlaneType.ATR72, plane.getType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, plane.getCapacity());
    }

    @Test
    public void hasTotalWeight() {
        assertEquals(5, plane.getWeight());
    }

    @Test
    public void canCreateSeatList() {
        plane2.createSeats();
        assertEquals(10, plane2.countSeats());
    }

}
