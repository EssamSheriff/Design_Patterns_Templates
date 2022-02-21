package bridge.model;

public class BridgeModel {

    public static void main(String[] args) {
        // TODO code application logic here
        Tv tv = new Tv();
        blackRemoto Bremoto = new blackRemoto(tv);
        Bremoto.TogglePower();
        Bremoto.Volume();
        System.out.println("**********************");
        whiteRemoto Wremoto = new whiteRemoto(tv);
        Wremoto.TogglePower();
        Wremoto.Volume();
        System.out.println("**********************");
        Radio radio = new Radio();
        Bremoto = new blackRemoto(radio);
        Bremoto.TogglePower();
        Bremoto.Volume();
        System.out.println("**********************");
        Wremoto = new whiteRemoto(radio);
        Wremoto.TogglePower();
        Wremoto.Volume();
        System.out.println("**********************");
    }

}
