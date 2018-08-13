abstract class exe41
{
abstract void run();
}

class Honda4 extends exe41
{
void run()
{
System.out.println("Running safely..");
}

public static void main(String args[])
{
exe41 obj = new Honda4();
obj.run();
}
}
