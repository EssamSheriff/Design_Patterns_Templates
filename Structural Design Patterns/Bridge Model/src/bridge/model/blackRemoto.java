
package bridge.model;


public class blackRemoto extends Remoto {

    public blackRemoto(implementation implementation) {
        super(implementation);
    }

    @Override
    void TogglePower() {
        System.out.println("Black Remoto      TogglePower");
        super.implementation.Enabled();
    }

    @Override
    void Volume() {
        System.out.println("Black Remoto      Volume");
        super.implementation.diEnabled();
        super.implementation.getVolume();
    }

}
