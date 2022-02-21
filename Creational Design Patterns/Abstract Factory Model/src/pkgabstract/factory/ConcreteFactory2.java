package pkgabstract.factory;

import pkgabstract.factory.model.AbstractFactory;
import pkgabstract.factory.model.ConcreteProductA2;
import pkgabstract.factory.model.ConcreteProductB2;
import pkgabstract.factory.model.ProductA;
import pkgabstract.factory.model.ProductB;

/**
 *
 * @author ZYZOOM - TEAM
 */
public class ConcreteFactory2 implements AbstractFactory{

    @Override
    public ProductA CreateProductA() {
           System.out.println("CreateProductA2");
                System.out.println("ConcreteFactory2");
return new ConcreteProductA2();
    }

    @Override
    public ProductB CreateProductB() {
           System.out.println("CreateProductB2");
                System.out.println("ConcreteFactory2");
        return new ConcreteProductB2();
    }
    
}
