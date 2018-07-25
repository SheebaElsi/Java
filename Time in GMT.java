import java.util.Scanner;
public class time {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        long timeChange = input.nextInt();

        long totalms = System.currentTimeMillis();

        long totalSec = totalms / 1000;

        long currentSecond = totalSec % 60;

        long totalMinutes = totalSec / 60;

        long Minute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long Hour = ((totalHours + timeChange) % 24);

        System.out.println("Current time is " + Hour + ":" + Minute + ":" + currentSecond);
    }
}

