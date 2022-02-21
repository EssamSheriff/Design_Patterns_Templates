package pkgabstract.factory.model;

public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public ProductA CreateProductA() {
        System.out.println("CreateProductA1");
        System.out.println("ConcreteFactory1");
        return new ConcreteProductA1();
    }

    @Override
    public ProductB CreateProductB() {
        System.out.println("CreateProductB1");
        System.out.println("ConcreteFactory1");
        return new ConcreteProductB1();
    }

}
