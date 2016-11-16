/**
 * Created by opilane on 21.10.2016.
 */
public class C2E2_Date {

    public static void main(String[] args) {
        String day = ("Friday");
        int date = 21;
        String month = ("October");
        int year = 2016;

        System.out.println(day + date + month + year);      //testing each variable on the same line
        System.out.println();

        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println();
        System.out.println("European format");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
}
