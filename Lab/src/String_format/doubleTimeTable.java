package String_format;

/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class doubleTimeTable {

    public static void main(String[] args) {
        print(3.6,44);
    }
    public static void print(double m,int n){

        if(m >= 0 && m <= 99 && n <= 99){
            for(int i = 1; i <= n; i++){
                double prod = m * i;
                String str = String.format("%6.3f x %2d = %9.3f",m,i,prod);
                System.out.println(str);
            }
        }

    }

}
