	public class exe17
	{  
	     int rollno;  
	     String name;  
	     static String college = "ITS";  
	       
	     static void change()
	     {  
	     college = "RIT";  
	     }  
	  
	     exe17(int r, String n)
	     {  
	     rollno = r;  
	     name = n;  
	     }  
	  
	     void display ()
	     {
	    	 System.out.println(rollno+" "+name+" "+college);
	     }
	     
	  
	    public static void main(String args[]){  
	    	exe17.change();  
	  
	    exe17 s1 = new exe17 (111,"Sheeba");  
	    exe17 s2 = new exe17 (222,"Keran");  
	    exe17 s3 = new exe17 (333,"Sha");  
	  
	    s1.display();  
	   	    s2.display();  
	   	    s3.display();  
	    	    }  
	    	}

