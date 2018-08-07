public	class exe12
{
int id;
String name;

exe12(int i,String n)
{
id = i;
name = n;
}
void display()
{
System.out.println(id+" "+name);
}

public static void main(String args[])
{
exe12 s1 = new exe12(1,"Sheeba");
exe12 s2 = new exe12(002,"Elsi Edith");
s1.display();
s2.display();
}
}
