
package factory.method.model;


public class ConcreteCreatorA extends Creator{
    
       @Override
    void Render() {
            System.out.println("Render in ConcreteCreatorA");
    }
    
    @Override
    Product CreateButton() {
return new ConcreteProductA();
    }
    
}
