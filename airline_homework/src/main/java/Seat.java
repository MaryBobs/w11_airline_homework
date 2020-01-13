public class Seat {

    private int number;
    private boolean booked;

    public void Seat() {
        this.number = number;
        this.booked = false;
    }


    public Object getBookedStatus() {
        return this.booked;
    }

    public void addNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
}
