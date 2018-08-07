public class exe19
{
	int ID;
	String name;

exe19(int ID,String name)
{
	this.ID = ID;
	this.name = name;
}
void display()
{
	System.out.println(ID+" "+name);
}
public static void main(String args[])
{
	exe19 a = new exe19(45,"Sheeba");
	exe19 b = new exe19(46,"Edith");
	a.display();
	b.display();
}
}