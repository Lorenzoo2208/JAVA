package Vicario.Lezione1;

public class App {
    public static void main(String[] args) {
        Square shape1 = new Square();
        shape1.setId(1);
        shape1.setEdge(4.);
        
        Shape shape2 = new Square();
        shape2.setId(2);
        ((Square) shape2).setEdge(3.);
    
        shape1.getArea();
        shape2.getArea();
    }
}