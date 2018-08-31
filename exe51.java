package exe40;

	interface A
	{  
	void a();//bydefault, public and abstract  
	void b();  
	void c();  
	void d();  
	}  
	  
	//Creating abstract class that provides the implementation of one method of A interface  
abstract class B implements A{  
	public void c()
	{
		System.out.println("This is Sha C");
		}  
	}  
	  
	//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
	class M extends B{  
	public void a()
	{
		System.out.println("This is Sheeba A");
		}  
	public void b()
	{
		System.out.println("This is Keran B");
		}  
	public void d()
	{
		System.out.println("This is Rinku D");
		}  
	}  
	  
	//Creating a test class that calls the methods of A interface  
	class ex40
	{  
	public static void main(String args[]){  
	A a=new M();  
	a.a();  
	a.b();  
	a.c();  
	a.d();  
	}}  
