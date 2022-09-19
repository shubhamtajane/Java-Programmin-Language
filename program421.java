import java.lang.*;
import java.util.*;
import java.io.File;
import java.awt.Desktop;

class program421
{
  public static void main(String arg[])
  {
  Scanner s = new Scanner(System.in);
  System.out.println("enter file name : ");
 String name= s.nextLine();
 
 
   File file=new File(name);
   if((file.exists()))
   {
     System.out.println("File Successfully open");
	 
    }
	else
	{
	  System.out.println("File Does not Exist");
	 }
  }
}