package KeyboardInput;
import Method.Circle;

import java.util.Scanner;

/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class enter {
    public static void printCircleInfo(){
        Scanner scanner = new Scanner(System.in);
        double myRadius = scanner.nextDouble();

        Circle.summariseCircle(myRadius);
        System.out.println(scanner.hashCode());
//1360875712
//        scanner.close();
    }

    public static void main(String[] args) {
        printCircleInfo();
    }
}
