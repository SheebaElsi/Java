public class exe41
{  
	 void eat()
	 {
		 System.out.println("Animal is eating...");
		 }  
	}  
	  
	class Dog extends exe41
	{  
	 void eat()
	 {
		 System.out.println("Dog is eating...");
		 }  
	  
	 public static void main(String args[])
	 {  
	  exe41
	  a=new Dog();  
	  a.eat();  
	 }  
	}  
