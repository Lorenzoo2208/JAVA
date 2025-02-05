public class WRectangle {
    
    private double base;
    private double height;
    private Shape shape;
    
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public Shape getShape() {
        return shape;
    }
    
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public double getArea() {
        return base * height;
    }

    public int getId() {
        return shape.getId();
    }



}