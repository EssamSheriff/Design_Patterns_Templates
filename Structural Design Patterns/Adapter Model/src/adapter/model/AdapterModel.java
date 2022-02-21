package adapter.model;

public class AdapterModel {

    public static void main(String[] args) {
        Vehicle car = new Car();
        car.accelerate();
        car.pushBreak();
        car.soundHorn();
        System.out.println("");
        Vehicle bicycle = new BicycleAdapter(new Bicycle());
        bicycle.accelerate();
        bicycle.pushBreak();
        bicycle.soundHorn();
    }

}
