package JavaInAction.Java02.ex03;

public class PerformanceTest {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Integer sumBoxed = 0;
        
        for (Integer i = 0; i < 1_000_000; i++){
            sumBoxed += 1;
        } 
    
        long endTime = System.nanoTime();
        System.out.print("Boxed Sum:\t" + sumBoxed + "\t");
        System.out.print("Time:\t" + (endTime - startTime) + "ns");
        System.out.println();
        
        startTime = System.nanoTime();
        int sumPrimitive = 0;
        for (int i = 0; i < 1_000_000; i++){
            sumPrimitive = 0;
        }

        endTime = System.nanoTime();
        System.out.print("Primitive Sum:\t" + sumPrimitive + "\t");
        System.out.print("Time:\t" + (endTime - startTime) + "ns");
        System.out.println();
        }
    }
