/**
 * Created by opilane on 19.10.2016.
 */
public class C2E3_Time {

    public static void main(String[] args) {
        int total = 24 * 3600;
        System.out.print("Total seconds in 24 hours: ");
        System.out.println(total);

        int hour, minute, second;
        hour = 16;
        minute = 51;
        second = 30;
        int sinceMid;
        sinceMid = (hour * 3600) + (minute * 60) + second;
        System.out.print(sinceMid);
        System.out.println(" seconds have passed since midnight.");
        System.out.print(total - sinceMid);
        System.out.println(" seconds remaining until the end of the day.");

        double percentageOne = sinceMid;
        double percentageTwo = total;
        System.out.print(percentageOne / percentageTwo * 100);
        System.out.println(" percent of today has passed.");

    }
}
