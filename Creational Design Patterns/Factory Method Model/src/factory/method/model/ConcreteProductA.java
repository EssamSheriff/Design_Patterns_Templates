/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.method.model;

/**
 *
 * @author ZYZOOM - TEAM
 */
public class ConcreteProductA implements Product {

    @Override
    public void render() {
        System.out.println("ConcreteProductA");
    }

    @Override
    public void onclick() {
        System.out.println("ConcreteProductA");
    }
    
}
