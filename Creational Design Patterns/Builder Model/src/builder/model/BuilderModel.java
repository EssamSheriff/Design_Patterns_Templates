package builder.model;

public class BuilderModel {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);
        Car car = builder.getProduct();
        car.details();
        System.out.println("**************************************");
        CarManualBuilder M_builder = new CarManualBuilder();
        director.constructSportCar(M_builder);
        Manual manual = M_builder.getProduct();
        manual.details();

    }

}
