package Vicario.Lezione1;

public class Shape {
    private double area;
    private int id;
    
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        System.out.println("Shape::setArea()");
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}