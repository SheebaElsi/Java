  public	class exe30
  {  
	  int speed=50;  
	}  
	class Bike3 extends exe30
	{  
	  int speed=100;  
	  void display()
	  {  
	   System.out.println(speed);//will print speed of Bike   
	  }  
	  public static void main(String args[]){  
	   Bike3 b=new Bike3();  
	   b.display();  
	}  
	}  