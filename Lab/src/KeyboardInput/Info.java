package KeyboardInput;
import java.util.Scanner;
/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class Info {
    public static void getNA(){

        Scanner scanner = new Scanner(System.in);
        //System.out.println("1\n");

        String str = scanner.nextLine();
       // System.out.println("2\n");

        Scanner s = new Scanner(str);
        //System.out.println("3\n");


        String name = s.next(); ;
        //System.out.println(name);
        //while(s.hasNext()){
       name = name  + " " + s.next() + " ";
       // }

        //s.nextLine();

        int Age = s.nextInt();

        System.out.println(name  + Age);

        s.close();
        scanner.close();
    }
    public static void main(String[] args) {
        Info.getNA();
    }
}
