
package factory.method.model;
import java.util.Scanner;

public class FactoryMethodModel {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.println("Press 1 for Product 1 and  2 for Product 2 ");
        int ch=input.nextInt();
       Creator productCteator;
        if(ch==1){
             productCteator=new ConcreteCreatorA();
        }else{
             productCteator=new ConcreteCreatorB();
        }
        
        productCteator.Render();
        Product p= productCteator.CreateButton();
        p.onclick();
        p.render();
        
               }
    
}
