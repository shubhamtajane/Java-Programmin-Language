import java.lang.*;
import java.io.*;
import java.util.*;

class program441
{
  public static void main (String arg[])
  {
  try
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Directory/File Name");
	String filename=sobj.nextLine();
	File file=new File(filename);
	String name;
	
	File allfiles[]=file.listFiles();
	
	for(int i=0;i<allfiles.length;i++)
	{
	  name=allfiles[i].getName();
	  if(name.endsWith(".txt"))
	   {
	     System.out.println(name);
	   }
	 
	}
  }
  catch(Exception obj)
  {
  
  }
}
}