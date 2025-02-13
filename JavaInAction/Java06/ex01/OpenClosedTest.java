package Java06.ex01;

public class OpenClosedTest {
    public static void main(String[] args) {
        Shape circle = new Circle( 5);
        Shape rectangle = new Rectangle( 4,  6);

        System.out.println("Circle area:" + circle.getArea());
        System.out.println("Rectangle area:" + rectangle.getArea());
        //expect
        // Circle area:78.5
        // REctangle area: 24.0
    }
   
}
