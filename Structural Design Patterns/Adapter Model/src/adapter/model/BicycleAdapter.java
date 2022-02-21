/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.model;

/**
 *
 * @author ZYZOOM - TEAM
 */
public class BicycleAdapter implements Vehicle {

    private Bicycle bicycle;

    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        bicycle.pedal();
    }

    @Override
    public void pushBreak() {
        bicycle.stop();
    }

    @Override
    public void soundHorn() {
        bicycle.ring();
    }

}
