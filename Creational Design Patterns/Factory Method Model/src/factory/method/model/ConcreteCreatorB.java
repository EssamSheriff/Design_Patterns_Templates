
package factory.method.model;

public class ConcreteCreatorB extends Creator{

        @Override
    void Render() {
            System.out.println("Render in ConcreteCreatorB");
    }
    @Override
    Product CreateButton() {
return new ConcreteProductB();
    }
    
}
