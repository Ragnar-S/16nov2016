import java.util.Scanner;
/**
 * Created by opilane on 19.10.2016.
 */
public class C3E2_Temperature {

    public static void main(String[] args) {
        //convert celsius to fahrenheit
        int celsius;
        final double FAHRENHEIT;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter celsius value (integers only): ");
        celsius = input.nextInt();
        FAHRENHEIT = celsius * (9.0 / 5.0) + 32;
        System.out.printf(celsius + " degrees celsius equals %.1f", FAHRENHEIT);
        System.out.println(" fahrenheit.");

    }
}
