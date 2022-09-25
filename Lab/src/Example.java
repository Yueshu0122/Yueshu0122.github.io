/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class Example {

    String str = new String("good");
    char[] ch = { 'a', 'b', 'c' };

    public static void main(String[] args) {
        Example ex = new Example();
       String str = new String("test;");
        ex.change(str, ex.ch);

        System.out.println(str);
        System.out.println(ex.str);
        System.out.println(ex.ch);
    }

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }

}
