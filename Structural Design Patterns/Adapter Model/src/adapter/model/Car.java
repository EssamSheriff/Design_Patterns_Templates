
package adapter.model;

public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Car is Run");    }

    @Override
    public void pushBreak() {
        System.out.println("Car is Stop");    }

    @Override
    public void soundHorn() {
            System.out.println("Beeb Beeb ................");    }


    
}
