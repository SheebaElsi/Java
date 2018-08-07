public	class exe24
{
A4 obj;
exe24(A4 obj)
{
this.obj=obj;
}
void display()
{
System.out.println(obj.data);
}
}

class A4
{
int data=3456;
A4()
{
exe24 b=new exe24(this);
b.display();
}
public static void main(String args[])
{
A4 a=new A4();
}
}
