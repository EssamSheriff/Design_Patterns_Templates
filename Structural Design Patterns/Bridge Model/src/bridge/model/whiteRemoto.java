/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.model;

/**
 *
 * @author ZYZOOM - TEAM
 */
public class whiteRemoto extends Remoto{
    
       public whiteRemoto(implementation implementation) {
        super(implementation);
    }

    @Override
    void TogglePower() {
        System.out.println("white Remoto      TogglePower");
        super.implementation.Enabled();
    }

    @Override
    void Volume() {
        System.out.println("white Remoto      Volume");
        super.implementation.diEnabled();
        super.implementation.getVolume();
    }
}
