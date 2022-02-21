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
public class Car {
    private int seats;
    private String engin;
    private boolean Gps;
    private boolean Trip;
    private int door;

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngin() {
        return engin;
    }

    public void setEngin(String engin) {
        this.engin = engin;
    }

    public boolean isGps() {
        return Gps;
    }

    public void setGps(boolean Gps) {
        this.Gps = Gps;
    }

    public boolean isTrip() {
        return Trip;
    }

    public void setTrip(boolean Trip) {
        this.Trip = Trip;
    }
    
        void details() {
        System.out.println("Car Details is ");
        System.out.println("Namber of Doors: "+door);
        System.out.println("Namber of Seats: "+seats);
        System.out.println("Engnie is: "+engin);
        System.out.println("Gps? "+Gps);
        System.out.println("TripComputer? "+Trip);
    }
}
