package exe42;

class ex42
{  
	int data=40;  
	void msg(){System.out.println("Hello java");}  
	}  
	  
	public class ex42
	{  
	 public static void main(String args[]){  
	   ex42 obj=new ex42();  
	   System.out.println(obj.data);//Compile Time Error  
	   obj.msg();//Compile Time Error  
	   }  	}  
