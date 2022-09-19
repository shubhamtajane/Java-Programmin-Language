import java.lang.*;
import java.io.*;
import java.util.*;

class program424
{
  public static void main(String arg[]) throws IOException
  {
     Scanner sobj=new Scanner(System.in);
	 System.out.println("Enter File Name that you want to create");
	 String Fname=sobj.nextLine();
	 
	 File file=new File(Fname);
	 
	 if(file.createNewFile())
	 {
	  System.out.println("File Successfully Created");
	 }
	 else
	 {
	   System.out.println("File Already Exist");
	 }
  }
 }