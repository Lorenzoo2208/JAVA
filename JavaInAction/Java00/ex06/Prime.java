package JavaInAction.Java00.ex06;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Inserisci un numero: ");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println(isPrime(n));
    }
    
public static boolean isPrime(int n){
    if(n<=1){
        return false;
    }
    for(int i=2; i<n; i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
}