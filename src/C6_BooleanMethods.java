/**
 * Created by opilane on 15.11.2016.
 */
public class C6_BooleanMethods {

    public static void main(String[] args) {
        System.out.println(isSingleDigit(2));
        boolean bigFlag = !isSingleDigitShort(17);
        System.out.println(bigFlag);
    }

    public static boolean isSingleDigit(int x) {
        if (x > -10 && x < 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSingleDigitShort(int x) {
        return x > -10 && x < 10;
    }
}
