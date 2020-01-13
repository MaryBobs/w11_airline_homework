import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatTest {

    private Seat seat;

    @Before
    public void before() {
        seat = new Seat();
    }

    @Test
    public void seatStartsUnbooked() {
        assertEquals(false, seat.getBookedStatus());
    }

    @Test
    public void canAddNumber() {
        seat.addNumber(2);
        assertEquals(2, seat.getNumber());
    }
}
