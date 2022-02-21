package pkgabstract.factory.model;

import java.util.Scanner;
import pkgabstract.factory.ConcreteFactory2;

public class AbstractFactoryModel {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 for Family 1 and  2 for Family 2 ");
        int ch = input.nextInt();
        AbstractFactory productCteator;
        ProductA pA = null;
        ProductB pB = null;

        if (ch == 1) {
            productCteator = new ConcreteFactory1();

        } else {
            productCteator = new ConcreteFactory2();

        }
        System.out.println("Press 1 for Product 1 and  2 for Product 2 ");
        int c = input.nextInt();
        if (c == 1) {
            pA = productCteator.CreateProductA();
            pA.paint();
        } else {
            pB = productCteator.CreateProductB();
            pB.paint();
        }
    }

}
