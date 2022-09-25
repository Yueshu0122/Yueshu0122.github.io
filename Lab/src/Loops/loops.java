package Loops;

/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class loops {
    public static void main(String[] args) {

        timetable(7,5);
    }

    public static void timetable(int n,int m){
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= 9; j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println("\n");
        }
    }
}
