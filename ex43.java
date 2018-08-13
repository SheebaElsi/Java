	abstract class exe43
	{  
		   exe43()
		   {
			   System.out.println("Car is created");
			   }  
	   abstract void run();  
	   void changeGear()
	   {
		   System.out.println("Gear changed");
		   }  
	 }  
	  
	 class Honda extends exe43
	 {  
	 void run()
	 {
		 System.out.println("Running safely..");
		 }  
	 }  
	 class TestAbstraction2
	 {  
	 public static void main(String args[])
	 {  
	  exe43 obj = new Honda();  
	  obj.run();  
	  obj.changeGear();  
	 }  
	}  
