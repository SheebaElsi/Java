import java.util.Scanner;
public class arith {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int b = in.nextInt();

        System.out.printf("Sum of the giventwo numbers: %d%n", a + b);
        System.out.printf("Difference of the given two numbers: %d%n", a - b);
        System.out.printf("Product of the given two numbers: %d%n", a * b);
        System.out.printf("Average of the given two numbers: %.2f%n", (double) (a + b) / 2);
        System.out.printf("Distance of two integers: %d%n", Math.abs(a - b));
        System.out.printf("Max number: %d%n", Math.max(a, b));
        System.out.printf("Min number: %d%n", Math.min(a, b));
    }
}