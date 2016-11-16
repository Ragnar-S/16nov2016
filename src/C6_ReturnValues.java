/**
 * Created by opilane on 15.11.2016.
 */
public class C6_ReturnValues {

    public static double calculateArea1(double radius) {    //the long way of writing the method
        double result = Math.PI * radius * radius;
        return result;
    }

    public static double calculateArea2(double radius) {    //a more concise way of writing the method
        return Math.PI * radius * radius;
    }

    public static double absoluteValue(double x) {      //an example of using several return values
        if (x < 0) {                                    //in a conditional statement.
            return  -x;
        } else {
            return x;
        }
    }
}