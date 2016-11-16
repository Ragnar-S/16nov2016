import java.awt.*;
import java.util.Scanner;

/**
 * Created by opilane on 19.10.2016.
 */
public class C1_2_3_Notes {

    public static void main(String[] args) {
        // generate some simple output
        System.out.println("Hello, World!");    //first line
        System.out.println("How are you?");     //second line

        System.out.print("Goodbye, ");
        System.out.println("cruel world!");

        System.out.print("Hello!\nHow are you doing?\n");   /*new line alternative
        you can also use \t for tab
        */

        System.out.println("She said \"Hello!\" to me.");

        String firstName = "Alpha";
        String lastName = "Bravo";
        System.out.println(firstName + " " + lastName);

        int hour, minute;
        hour = 11;
        minute = 59;
        System.out.println("The current time is " + hour + ":" + minute + " ");
        System.out.print("Number of minutes  since midnight: ");
        System.out.println(hour * 60 + minute);

        String line;
        Scanner in = new Scanner(System.in);
        System.out.print("Type something: ");
        line = in.nextLine();
        System.out.println("You typed: " + line);

        int inch;
        final double CM_PER_INCH;
        Scanner input = new Scanner(System.in);
        System.out.print("Convert inches to centimeters: ");
        inch = input.nextInt();
        CM_PER_INCH = inch * 2.54;
        System.out.print(inch + " inches = ");
        System.out.println(CM_PER_INCH + "cm");

        System.out.printf("Five divided by eight = %.2f", 5.0 / 8.0);
    }
}
