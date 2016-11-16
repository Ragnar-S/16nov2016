/**
 * Created by opilane on 15.11.2016.
 */
public class C6_WritingMethods {

    public static void main(String[] args) {
        double dist = distance(1.0, 2.0, 4.0, 6.0);     //variable "dist" equals the method "distance"
        System.out.println(dist);                       //with the parameters we have a assigned
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        System.out.println("dx is " + dx);
        System.out.println("dy is " + dy);
        double dsquared = dx * dx + dy * dy;
        System.out.println("dsquared is " + dsquared);
        double result = Math.sqrt(dsquared);
        return result;
    }
}
