package prototype.model;

public class Rectangle extends Shape {

     int width;
     int height;

    public Rectangle(Rectangle shape) {
        super(shape);
        this.width = shape.width;
        this.height = shape.height;
    }

    public Rectangle() {
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.height == height;
    }
}
