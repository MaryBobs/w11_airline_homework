public class Passenger {

    private String name;
    private int bags;
    private Flight flight;
    private int seat;

    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
        this.flight = flight;
        this.seat = 0;
    }

    public String getName() {
        return this.name;
    }

    public int countBags() {
        return this.bags;
    }

    public void addFlight(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public int getSeat() {
        return this.seat;
    }

    public void addSeat(int number) {
        this.seat = number;
    }
}
