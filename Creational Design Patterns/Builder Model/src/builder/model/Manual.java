/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.model;

/**
 *
 * @author ZYZOOM - TEAM
 */
public class Manual {

    private int seats;
    private String engin;
    private boolean Gps;
    private boolean Trip;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngin(String engin) {
        this.engin = engin;
    }

    public void setGps(boolean Gps) {
        this.Gps = Gps;
    }

    public void setTrip(boolean Trip) {
        this.Trip = Trip;
    }

    void details() {
        System.out.println("Manual Details is ");
        System.out.println("Namber of Seats: "+seats);
        System.out.println("Engnie is: "+engin);
        System.out.println("Gps? "+Gps);
        System.out.println("TripComputer? "+Trip);
    }
}

