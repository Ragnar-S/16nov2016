/**
 * Created by opilane on 16.11.2016.
 */
public class C6E3_Triangle {

    public static void main(String[] args) {
    System.out.println(isTriangle(2, 4, 5));
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a + b < c) {
            return false;
        } else if (a + c < b) {
            return false;
        } else if (b + c < a) {
            return false;
        } else {
            return true;
        }
    }
}
