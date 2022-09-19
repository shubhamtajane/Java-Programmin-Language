import java.lang.*;
import java.io.*;
import java.util.*;

class program431
{
  public static void main(String arg[])
  {
    try
	{
	  Scanner sobj=new Scanner(System.in);
	  System.out.println("Enter Existing File Name");
	  String filename=sobj.nextLine();
	  File file=new File(filename);
	  
	  System.out.println("Enter File name to create");
	  String newfile=sobj.nextLine();
	  File fobj=new File(newfile);
	  boolean bobj=fobj.createNewFile();
	  byte buffer[]=new byte[100];
	  
	  if(file.exists())
	  {
	    FileInputStream fiobj=new FileInputStream(file);
		FileOutputStream foobj=new FileOutputStream(fobj);
	    int ret=0;
		while((ret=fiobj.read(buffer))!=-1)
		{
		   foobj.write(buffer,0,ret);
		}
	  }
	  else
	  {
	    System.out.println("There is no such files");
	  }
	}
	catch(Exception obj)
	{
	
	
	}
  }
 }