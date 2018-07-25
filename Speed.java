import java.util.Scanner;
public class speed {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

		float Seconds;
		float meter,kilometer, mph;

		System.out.print("Enter distance in meters: ");
		float distance = scanner.nextFloat();

		System.out.print("Enter hour: ");
		float hr = scanner.nextFloat();

		System.out.print("Enter minutes: ");
		float min = scanner.nextFloat();

		System.out.print("Enter seconds: ");
		float sec = scanner.nextFloat();

		Seconds = (hr*3600) + (min*60) + sec;
		meter = distance / Seconds;
		kilometer = ( distance/1000.0f ) / (Seconds/3600.0f );
		mph = kilometer / 1.609f;

		System.out.println("Your speed in meters/second is "+meter);
		System.out.println("Your speed in km/h is "+kilometer);
		System.out.println("Your speed in miles/h is "+mph);
		

		scanner.close();
	}
}

