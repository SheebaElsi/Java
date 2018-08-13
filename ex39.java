   public	class exe39
   {  
	void eat()
	{
		System.out.println("Eating");
		}  
	}  
	  
	class exe39a extends exe39
	{  
	void eat()
	{
		System.out.println("Eating Veggies");
		}  
	}  
	  
	class exe39b extends exe39a
	{  
	void eat()
	{
		System.out.println("Drinking milk");
		}  
	  
	public static void main(String args[])
	{  
	exe39 a1,a2,a3;  
	a1=new exe39();  
	a2=new exe39a();  
	a3=new exe39b();  
	  
	a1.eat();  
	a2.eat();  
    a3.eat();  
}
}