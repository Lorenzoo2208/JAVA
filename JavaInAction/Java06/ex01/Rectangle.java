
    package Java06.ex01;
    
    class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        
        public double getArea() {
            return width * height;
        }
}
