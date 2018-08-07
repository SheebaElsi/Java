public	class exe16{  
	static int count=78;//will get memory only once and retain its value  
	  
	exe16()
	{  
	count++;  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	  
		exe16 c1=new exe16();  
		exe16 c2=new exe16();  
		exe16 c3=new exe16();  
	  
	 }  
	}  
