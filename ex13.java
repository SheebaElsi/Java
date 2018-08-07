public	class exe13
{
int id;
String name;
int age;
exe13(int i,String n)
{
id = i;
name = n;
}
exe13(int i,String n,int a)
{
id = i;
name = n;
age=a;
}
void display()
{
System.out.println(id+" "+name+" "+age);
}

public static void main(String args[])
{
exe13 s1 = new exe13(111,"Sheeba");
exe13 s2 = new exe13(222,"Elsi",20);
s1.display();
s2.display();
}
}
