
	public class exe5
	{  
	 int length;  
	 int width;  
		  
		 void insert(int l,int w)
		 {  
		  length=l;  
		  width=w;  
		 }  
		  
		 void calculateArea()
		 {
			 System.out.println("Area of the rectangle is");
			 System.out.println(length*width);
			 }  
		  
		 public static void main(String args[])
		 {  
		  exe5 r1=new exe5(),r2=new exe5(); 
		    
		  r1.insert(11,5);  
		  r2.insert(3,15);  
		  
		  r1.calculateArea();  
		  r2.calculateArea();  
		}  
		}  


