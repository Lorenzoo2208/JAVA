package Java06.ex00;

public class SingleResponsabilityTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Logger logger = new Logger();
        double a = 10, b = 5;
        double sum = calc.add(a,b);
        logger.log(a, "+", b, sum);
        double difference = calc.substract(a,b);
        logger.log(a, "-", b, difference);
        double product = calc.multiply(a,b);
        logger.log(a, "*", b, product);
        double quotient = calc.divide(a,b);
        logger.log(a, "/", b, quotient);
        
    }
}
