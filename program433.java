import java.lang.*;
import java.io.*;
import java.util.*;

class program433
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Ente folder Name");
	String filename=sobj.nextLine();
	File file=new File(filename);
	
	if(file.mkdir())
	{
	  System.out.println("Directory Successfully created");
	}
  }
}