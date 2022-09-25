package Conditions;

/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {

        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;

        }else{
            return false;
        }

    }

}
