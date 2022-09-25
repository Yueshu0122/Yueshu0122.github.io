package String_format;

/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class strFormat {

    public static void main(String[] args) {

        System.out.println(padding("simon",'$',15));
    }

    public static String padding(String str,char c,int len){
        int strlen = str.length();
        String outcome = "";
        for(int i = 0; i < len-strlen; i++){
            outcome = outcome + c;
        }
        outcome = outcome + str;

        return outcome;

    }
}
