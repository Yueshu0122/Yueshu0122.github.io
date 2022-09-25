package KeyboardInput;
import java.util.Scanner;
/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class Lab3Ex1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       // System.out.println("Please enter your name," +
        //        " followed by the return key.");

       // String userEntry = keyboard.nextLine();
        System.out.println("Please enter your age");
        //String userAge = keyboard.nextLine();
        int userAge = keyboard.nextInt();

       // keyboard.nextLine();
        System.out.println("You are " + userAge + " years old");
        System.out.println("What is your favourite colour?");
        String col = keyboard.nextLine();
        //System.out.println("Hello " + userEntry);
    }
}
