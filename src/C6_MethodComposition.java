/**
 * Created by opilane on 15.11.2016.
 */
public class C6_MethodComposition {

    public static void main(String[] args) {
        System.out.println(calculateArea(2, 3, 4, 5));
    }

    public static double distance(double x1, double y1, double x2, double y2) {     //from C6_WritingMethods
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        double result = Math.sqrt(dsquared);
        return result;
    }

    public static double calculateArea(double radius) {     //from C6_ReturnValues
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double xc, double yc, double xp, double yp) {    //formerly known as "circleArea"
        return calculateArea(distance(xc, yc, xp, yp));                                 //now overloaded
    }
}
