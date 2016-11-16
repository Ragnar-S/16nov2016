/**
 * Created by opilane on 16.11.2016.
 */
public class C6E7_OddSum {

    public static void main(String[] args) {
       System.out.println(oddSum(7));
    }

    public static int oddSum(int n) {
        if (n == 1) {
            return 1;
        }
        int recurse = oddSum(n - 2);
        int result = n + recurse;
        return result;
    }
}
