public class exe38
{  
	int getRateOfInterest()
	{
		return 0;
		}  
	}
	 
	  
	class SBI extends exe38
	{  
	int getRateOfInterest(){return 8;
	}  
	}  
	  
	class ICICI extends exe38
	{  
	int getRateOfInterest(){return 7;
	}  
	}  
	class AXIS extends exe38
	{  
	int getRateOfInterest(){return 9;
	}  
	}  
	  
	class Test3
	{  
	public static void main(String args[])
	{  
	exe38 b1=new SBI();  
	exe38 b2=new ICICI();  
	exe38 b3=new AXIS();  
	System.out.println("SBI Rate of Interest: "+b1.getRateOfInterest());  
	System.out.println("ICICI Rate of Interest: "+b2.getRateOfInterest());  
	System.out.println("AXIS Rate of Interest: "+b3.getRateOfInterest());  
	}  
	}  
