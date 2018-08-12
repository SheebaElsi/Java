import java.io.FileOutputStream;  
public class f1
{  
    public static void main(String args[])
    {    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\edith.txt");    
             String s="Welcome to javaTpoint.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  