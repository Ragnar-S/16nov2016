import java.util.Scanner;
/**
 * Created by opilane on 19.10.2016.
 */
public class C3E3_Time {

    public static void main(String[] args) {
        //converts seconds to hh:mm:ss
        int hour, minute, second, ini;
        Scanner input = new Scanner(System.in);
        System.out.print("How many seconds (integers only)? ");
        ini = input.nextInt();
        hour = ini / 3600;
        minute = (ini % 3600) / 60;
        second = (ini % 3600) % 60;
        System.out.println(ini + " seconds equals " + hour + " hour(s), " + minute + " minute(s), " + second + " second(s)");

    }
}
