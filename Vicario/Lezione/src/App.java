public class App {
    public static void main(String[] args) throws Exception {
        
        Shape shape = new Shape();
        shape.setId(100);

        WRectangle wR = new WRectangle();
        wR.setHeight(1);
        wR.setBase(2);
        
        wR.setShape(shape);

        wR.getArea();
        
        System.out.println("\nArea del rettangolo wR è: " + wR.getArea());
        System.out.println("L\'id di wR è: " + wR.getId() + "\n");

        shape.setArea(10);
        System.out.println("Area Shape è: " + shape.getArea() + "\n");

        HRectangle hR = new HRectangle();
        hR.setHeight(1);
        hR.setBase(2);
        hR.setId(100);
        System.out.println("Area del rettangolo hR è: " + hR.getArea());
        System.out.println("L\'id di hR è: " + hR.getId());


    }
}