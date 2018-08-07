public class exe7
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(double a,double b)
	{
		System.out.println(a+b);
	}
public static void main(String args[])
{
exe7 o = new exe7();
o.sum(5, 18);
o.sum(5.5, 19.7);
}
}
