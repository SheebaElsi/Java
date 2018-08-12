   public	class exe35
   {  
	  final void run()
	  {
		  System.out.println("running");
		  }  
	}  
	     
	class Honda extends exe35
	{  
	   void run()
	   {
		   System.out.println("running safely with 100kmph");
		   }  
	     
	   public static void main(String args[])
	   {  
	   Honda honda= new Honda();  
	   honda.run();  
	   }  
	}  
