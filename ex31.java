  	public class exe31
  	{  
	  int speed=250;  
	}  
	  
	class Bike4 extends exe31
	{  
	  int speed=100;  
	      
	  void display()
	  {  
	   System.out.println(super.speed);//will print speed of Vehicle now  
	  }  
  public static void main(String args[])
  {  
	   Bike4 b=new Bike4();  
	   b.display();  
  }
	}