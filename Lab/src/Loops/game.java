package Loops;
import java.util.Random;
import java.util.Scanner;
/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class game {

    public static void main(String[] args) {
            guessGame();
    }

    public static void guessGame(){
        int count1 = 0;
        int count2 = 0;
        while(true){
            if(count1 == 3 || count2 == 3){
                if(count1 == 3){
                    System.out.println("you win");
                }else {
                    System.out.println("you lose");
                }
                break;
            }
            System.out.println("please type your choice 0:Paper;1:scissors;2:stone");
            Scanner s = new Scanner(System.in);
            int mychoice = s.nextInt();
            Random r = new Random();
            int comChoice = r.nextInt(100) % 3;
            if(mychoice == 0 && comChoice == 2){
                count1++;
                System.out.println("you win this turn");
            }else if(mychoice == 1 && comChoice == 0){
                count1++;
                System.out.println("you win this turn");
            } else if (mychoice == 2 && comChoice == 1) {
                count1++;
                System.out.println("you win this turn");
            }else if(comChoice == 0 && mychoice == 2){
                count2++;
                System.out.println("you lost this turn");
            }else if(comChoice == 1 && mychoice == 0){
                count2++;
                System.out.println("you lost this turn");
            } else if (comChoice == 2 && mychoice == 1) {
                count2++;
                System.out.println("you lost this turn");
            }else{
                System.out.println("deuce");
            }


        }





    }
}
