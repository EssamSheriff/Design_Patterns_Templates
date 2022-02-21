/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.model;

/**
 *
 * @author ZYZOOM - TEAM
 */
import java.util.Objects;

public abstract class Shape {
     int x;
     int y;
 String color;
    public Shape() {
    }

    
    public Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.color=shape.color;
    }
    
    
    public abstract Shape clone();
    
     @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
