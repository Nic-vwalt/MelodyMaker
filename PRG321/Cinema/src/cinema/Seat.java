package cinema;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Seat {

    protected String seatnumber;
    protected boolean seattaken;

    public Seat(String seatnumber, boolean seattaken) {
        this.seatnumber = seatnumber;
    }

    public String getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(String seatnumber) {
        this.seatnumber = seatnumber;
    }

    public boolean isSeattaken() {
        return seattaken;
    }

    public void setSeattaken(boolean seattaken) {
        this.seattaken = seattaken;
    }


    public void BookSeat(Seat thisseat) {
        synchronized (this) {
            if (thisseat.isSeattaken()) {
                try {
                    System.out.println("Sorry! Can't book that seat");
                    // throw new IllegalArgumentException("Ca't withdraw");
                    this.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Client.currentThread().getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("Booked " + seatnumber + " in thread:" + Thread.currentThread().getName());
                this.seattaken = true;
            }
        }
    }

    public void LeaveSeat(Seat thisseat) {
        synchronized (this) {
            if (thisseat.isSeattaken() == false) {
                try {
                    System.out.println("Sorry! Can't unbook that seat");
                    // throw new IllegalArgumentException("Ca't withdraw");
                    this.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Client.currentThread().getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("unBooked " + seatnumber + " in thread:" + Thread.currentThread().getName());
                this.seattaken = false;
            }
        }
    }

    @Override
    public String toString() {
        return "Seat{" + "seatnumber=" + seatnumber + ", seattaken=" + seattaken + '}';
    }
}
