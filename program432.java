import java.lang.*;
import java.io.*;
import java.util.*;

class program432
{
  public static void main(String arg[])
   {
  
     Scanner sobj=new Scanner(System.in);
	 System.out.println("Enter File name");
	 String filename=sobj.nextLine();
	 File fobj=new File(filename);
	 
	 if(fobj.exists())
	 {
	  System.out.println("FIle is Regular File");
	 }
	 else
	 {
	  System.out.println("This file is not a regular file");
	 }
   }
}