/**
 * Created by opilane on 15.11.2016.
 */
public class C6_Recursion {

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.print(fibonacci(10));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int recurse = factorial(n - 1);
        int result = n * recurse;
        return result;
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
