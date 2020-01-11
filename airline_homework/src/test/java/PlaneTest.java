import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.ATR72);
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
        assertEquals(4, plane.getWeight());
    }
}
