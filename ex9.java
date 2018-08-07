public	class exe9{  
	  void sum(int a,long b)
	  {
		  System.out.println(a+b);
		  }  
 void sum(int a,int b,int c)
 {
	 System.out.println(a+b+c);
	 }  
	  
  public static void main(String args[]){  
	  exe9 o=new exe9();  
	  o.sum(20,50);//now second int literal will be promoted to long  
	  o.sum(20,90,210);  
	  
	  }  
	}  
