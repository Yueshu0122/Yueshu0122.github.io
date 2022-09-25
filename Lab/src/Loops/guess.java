package Loops;
import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class guess {

    public static void guessNum(){
        Scanner s = new Scanner(System.in);
        int count = 10;
        Random rand = new Random();
        int randomNum = rand.nextInt(100);

        while(true){

            System.out.println("please guess the number");
            int guess = s.nextInt();

            if(guess == randomNum){
                System.out.println("good job you are right"+"  number"+randomNum);
                break;
            }else{
                count--;
                if(guess > randomNum){
                    System.out.println("your guess is too high,guess chances = "+count);

                }else {
                    System.out.println("your guess is too low,guess chances = "+count);
                }
                if(count == 0){
                    System.out.println("randomNum = "+randomNum);
                    break;
                }
            }


        }
    }

    public static void main(String[] args) {
        guessNum();
    }
}
