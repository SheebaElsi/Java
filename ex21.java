public	class exe21
{  
	    int id;  
	    String name;  
	    String city;  
	      
	    exe21(int id,String name)
	    {  
	    this.id = id;  
	    this.name = name;  
	    }  
	    exe21(int id,String name,String city)
	    {  
	    this(id,name);//now no need to initialize id and name  
	    this.city=city;  
	    }  
	    void display()
	    {
	    	System.out.println(id+" "+name+" "+city);
	    	}  
	      
	    public static void main(String args[]){  
	    	exe21 o1 = new exe21(111,"Sheeba");  
	    	exe21 o2 = new exe21(222,"Hepsibah","Kerala");  
	    o1.display();  
	    o2.display();  
	   }  
	}  
