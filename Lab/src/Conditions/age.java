package Conditions;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class age {
    public static void main(String[] args) {
        System.out.println(getAge());
    }
    public static int getAge(){
        System.out.println("Enter your dob as three integers separated by spaces: year month day");
        Scanner scanner = new Scanner(System.in);
         int year = scanner.nextInt();
         int month = scanner.nextInt();
         int day = scanner.nextInt();
        Date cur = new Date();
        int curYear = cur.getYear() + 1900;
        int curmonth = cur.getMonth();
        int curday = cur.getDay();

        if(month < curmonth){
           return curYear-year;
        }else if(month == curmonth && day == curday){
            return  curYear-year;
        }else{
            return curYear-year-1;
        }
    }


}
