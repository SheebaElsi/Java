package exe48;

public	class ex48 implements Cloneable{  
	int rollno;  
	String name;  
	  
	ex48(int rollno,String name)
	{  
	this.rollno=rollno;  
	this.name=name;  
	}  
  
	public Object clone()throws CloneNotSupportedException
	{  
	return super.clone();  
	}  
	  
	public static void main(String args[])
	{  
	try{  
	ex48 s1=new ex48(050,"Elsi");  
	  
	ex48 s2=(ex48)s1.clone();  
	  
	System.out.println(s1.rollno+" "+s1.name);  
	System.out.println(s2.rollno+" "+s2.name);  
	  
	}catch(CloneNotSupportedException c)
	{
		
	}  
	  
	}  
	}  
