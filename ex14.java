	class exe14
	{  
	    int id;  
	    String name;  
	    exe14(int i,String n)
	    {  
	    id = i;  
	    name = n;  
	    }  
	      
	    exe14(exe14 s)
	    {  
	    id = s.id;  
	    name =s.name;  
	    }  
	    void display()
	    {
	    	System.out.println(id+" "+name);
	    	}  
	   
	    public static void main(String args[])
	    {  
	    exe14 s1 = new exe14(123,"Sheeba");  
	    exe14 s2 = new exe14(s1);  
	    s1.display();  
	    s2.display();  
	   }  
	}  
