import java.util.Scanner;

public class unique {
    
 public static void main(String[] args)
 {
		int value = 0;
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= 4; j++)
			{
				for(int k = 1; k <= 4; k++)
				{
					if(k != i && k != j && i != j)
					{
						value++;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
		System.out.println("Total number of the three-digit-numbers is " + value);
	}
}