package Loops;

/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class isPrimeNum {

    public static boolean isPrime(int n){
        for(int i = 3; i <= n/2 ; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
