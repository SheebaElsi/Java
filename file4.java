import java.io.FileOutputStream; 
import java.io.FileInputStream;  
public class f4
{  
     public static void main(String args[]){    
          try
          {    
            FileOutputStream fout=new FileOutputStream("D:\\elsi.txt");    
            FileInputStream fin=new FileInputStream("D:\\elsi.txt");    
                
            int limit = 50;
    		
    		System.out.println("Printing Even numbers between 1 and " + limit);
            for(int i =1; i <= limit; i++)
            {
    			
    			// if the number is divisible by 2 then it is even
    			if( i % 2 == 0)
    			{
    				 
    	             String s = null;
					byte b[]=s.getBytes();//converting string into byte array    
    	             
					fout.write(b);    
    	             fout.close(); 
    				 while((i=fin.read())!=-1)
    				 {    
             System.out.print((char)i);    
            }    
            fin.close();
            }
          }
          }
            catch(Exception e)
            {
            	System.out.println(e);
            }    
         }
     }

        