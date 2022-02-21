
package bridge.model;

public abstract class Remoto {
    implementation implementation ;

    public Remoto(implementation implementation) {
        this.implementation = implementation;
    }
    abstract void TogglePower();
   abstract void Volume();
}
