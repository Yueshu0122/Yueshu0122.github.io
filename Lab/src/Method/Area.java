package Method;

/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class Area {
    public static double computeArea(double myRadius) {
        double pi = 3.14152;
        double myArea = pi * myRadius * myRadius;
        return myArea;
    }

    public static void main(String[] args) {
        double radius = 5.4;
        double area = computeArea(radius);
        System.out.println("The area of a circle with radius" + radius + "equals" + area);
    }
}
