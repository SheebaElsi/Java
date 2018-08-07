public	class exe20
{  
	    int id;  
	    String name;  
	    exe20()
	    {
	    	System.out.println("Default constructor is invoked");
	    	}  
	      
	    exe20(int id,String name)
	    {  
	    this ();//it is used to invoked current class constructor.  
	    this.id = id;  
	    this.name = name;  
	    }  
	    void display()
	    {
	    	System.out.println(id+" "+name);
	    	}  
	      
	    public static void main(String args[])
	    {  
	    	exe20 a = new exe20(1,"Selbah");  
	    	exe20 b = new exe20(2,"Sheeba");  
	    a.display();  
	    b.display();  
	   }  
	}  
