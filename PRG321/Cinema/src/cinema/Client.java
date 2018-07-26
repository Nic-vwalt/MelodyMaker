
package cinema;

public class Client extends Person{

    protected Seat cleintseat;
    
    public Client(int personid, int age, String name, String surname) {
        super(personid, age, name, surname);
    }

    public Seat getCleintseat() {
        return cleintseat;
    }

    public void setCleintseat(Seat cleintseat) {
        this.cleintseat = cleintseat;
    }

    public Client(Seat cleintseat, int personid, int age, String name, String surname) {
        super(personid, age, name, surname);
        this.cleintseat = cleintseat;
    }

    @Override
    public String toString() {
        return "Client{" + "cleintseat=" + cleintseat + '}';
    }

    @Override
    public void run() {
        cleintseat.BookSeat(this.cleintseat);
    }
}
