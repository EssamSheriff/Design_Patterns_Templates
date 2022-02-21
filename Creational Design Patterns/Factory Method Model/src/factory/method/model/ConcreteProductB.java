
package factory.method.model;

public class ConcreteProductB implements Product {

    @Override
    public void render() {
        System.out.println("ConcreteProductB");
    }

    @Override
    public void onclick() {
        System.out.println("ConcreteProductB");
    }
    
}
