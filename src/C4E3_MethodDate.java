/**
 * Created by opilane on 21.10.2016.
 */
public class C4E3_MethodDate {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        printAmerican("Friday", 21, "October", 2016);
        System.out.println();
        printEuropean("Friday", 21, "October", 2016);
    }
}
