import java.lang.*;
import java.io.*;
import java.util.*;

class program443
{
  public static void main(String arg[])
  {
   try
   {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Ente Directory/Folder Name");
	String filename=sobj.nextLine();
	
	File file=new File(filename);
	File allfiles[]=file.listFiles();
	String name;
	
    System.out.println("Enter File Name");
	String newfile=sobj.nextLine();
	
	File fobj=new File(newfile);
	boolean bobj=fobj.createNewFile();
	byte buffer[]=new byte[100];
	int ret=0;
    FileOutputStream foobj=new FileOutputStream(fobj);

	
	for(int i = 0; i < allfiles.length; i++)
	{
	  name=allfiles[i].getName();
	  if(name.endsWith(".txt"))
	  {
	  FileInputStream fiobj=new FileInputStream(allfiles[i]);

	   while((ret=fiobj.read(buffer))!=-1)
	   {

	      foobj.write(buffer,0,ret);
		}
	  }
	}
  }
  catch(Exception obj)
  {
  
  
  }
}
}
	    