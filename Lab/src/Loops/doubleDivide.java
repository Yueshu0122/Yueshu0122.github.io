package Loops;

/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class doubleDivide {

    public static void doubledivison(double d1,double d2){



        if(d1 < d2){
            System.out.println(d1+" can fit into a zero with a remainder of "+ d1);
        }else{
            int n = 1;

            while(true){

                if(d2 * n > d1){
                    System.out.println(d1+" can fit into a "+(n-1)+" with a remainder of "+ (d1-d2*(n-1)));
                    break;
                }

                n++;

            }
        }

    }

    public static void main(String[] args) {
        doubledivison(4.2,1.6);
    }
}
