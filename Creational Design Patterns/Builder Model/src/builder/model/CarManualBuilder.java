package builder.model;

public class CarManualBuilder implements Builder {
    
    private Manual manual;
    
    public CarManualBuilder() {
        this.rest();
    }
    
    @Override
    public void rest() {
        manual = new Manual();
    }
    
    public Manual getProduct() {
        Manual product = this.manual;
        this.rest();
        return product;
    }
    
    @Override
    public void setSeats(int number) {
        manual.setSeats(number);
    }
    
    @Override
    public void setEngine(String eng) {
        manual.setEngin(eng);
    }
    
    @Override
    public void setGPS() {
        manual.setGps(false);
    }
    
    @Override
    public void setTripComputer() {
        manual.setTrip(false);
    }
    
}
