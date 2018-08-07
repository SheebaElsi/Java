public	class exe23
{
void m(exe23 obj)
{
System.out.println("Method is invoked successfully..!!");
}
void p()
{
m(this);
}

public static void main(String args[])
{
exe23 s1 = new exe23();
s1.p();
}
}
