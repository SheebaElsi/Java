import java.util.Scanner;
public class bmi {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        double BMI = weight / (height * height);
        System.out.print("Your Body Mass Index is " + BMI+"\n");
    }
}