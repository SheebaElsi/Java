public	class exe15
{  
	int count=9;//will get memory when instance is created  
	  
	exe15()
	{  
	count++;  
	System.out.println(count);  
	}  
	  
	public static void main(String args[])
	{  
	  
	exe15 c1=new exe15();  
	exe15 c2=new exe15();  
	exe15 c3=new exe15();  
	  
	 }  
	}  
