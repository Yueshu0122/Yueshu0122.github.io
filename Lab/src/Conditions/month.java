package Conditions;

/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class month {
    public static void main(String[] args) {

        System.out.println(days("feb",2000));

    }

    public static int days(String month,int year){
        //一年有12个月，其中每个月的天数是：
        // 每个月31天的有1月、3月、5月、7月、8月、10月、12月，
        // 一共是七个月；每月30天的有4月、6月、9月、11月共四个月；
        // 2月是平月（二十八天）或者是闰月（二十九天）。
        month = month.toUpperCase();
        if(month.equals("JAN")||month.equals("MAR")||
                month.equals("MAY")||month.equals("JUL")||month.equals("AUG")
                ||month.equals("OCT")||month.equals("DEC")){

            return 31;

        } else if (month.equals("APR")||month.equals("JUN")
                ||month.equals("SEP")||month.equals("NOV")) {
            return 30;
        }else{
            if(LeapYear.isLeapYear(year)){
                return 29;
            }else{
                return 28;
            }
        }
    }

}
