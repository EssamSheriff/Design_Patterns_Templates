package builder.model;

public class CarBuilder implements Builder {
    
    private Car car;
    
    public CarBuilder() {
        this.rest();
    }
    
    Car getProduct() {
        Car product = this.car;
        this.rest();
        return product;
    }
    
    @Override
    public void rest() {
        this.car = new Car();
    }
    
    @Override
    public void setSeats(int number) {
        car.setSeats(number);
        car.setDoor(number);
    }
    
    @Override
    public void setEngine(String eng) {
        car.setEngin(eng);
    }
    
    @Override
    public void setGPS() {
        car.setGps(true);
    }
    
    @Override
    public void setTripComputer() {
        car.setTrip(true);
    }
    
}
