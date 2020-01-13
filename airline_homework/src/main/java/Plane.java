import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;
    private ArrayList<Seat> seatList;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
        this.seatList = new ArrayList<Seat>();
    }

    public PlaneType getType() {
        return this.planeType;
    }

    public int getCapacity() {
        return this.planeType.getCapacity();
    }

    public int getWeight() {
        return this.planeType.getWeight();
    }

    public void createSeats() {
        int seatNum = 0;
//        ArrayList<Seat> seats = new ArrayList<Seat>();
        while (seatList.size() < this.getCapacity()) {
            seatNum = seatNum + 1;
            Seat seat = new Seat();
            seat.addNumber(seatNum);
            this.seatList.add(seat);
        }
//        this.seatList = seats;
    }

    public int countSeats() {
        return this.seatList.size();
    }


}
