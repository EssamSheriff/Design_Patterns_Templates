package builder.model;

public class Director {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    void constructSportCar(Builder builder) {
        builder.rest();
        builder.setSeats(4);
        builder.setEngine("Work");
        builder.setGPS();
        builder.setTripComputer();
    }

    void constructSUV(Builder builder) {
        builder.rest();
        builder.setSeats(4);
        builder.setEngine("Work");
    }
}
