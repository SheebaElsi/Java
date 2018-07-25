import java.util.Scanner;
public class minute {

    public static void main(String[] Strings) {


        double Year = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the minutes: ");

        double minute = input.nextDouble();

        long years = (long) (minute / Year);
        int days = (int) (minute / 60 / 24) % 365;

        System.out.println((int) minute + " minutes is approximately " + years + " years and " + days + " days");
    }
}