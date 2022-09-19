import java.lang.*;
import java.io.*;
import java.util.*;

class program442
{
  public static void main(String arg[])
  {
   try
   {
     Scanner sobj=new Scanner(System.in);
	 System.out.println("Enter Directory/Folder name");
	 String foldername=sobj.nextLine();
	 File fobj=new File(foldername);
	 File allfiles[]=fobj.listFiles();
	 
	 System.out.println("Enter file Name");
	 String filename=sobj.nextLine();
	 File file=new File(filename);
	 String name;
	 boolean bobj=file.createNewFile();
	 FileOutputStream writerobj=new FileOutputStream(file);
	byte buffer[]=new byte[100];
	int ret=0;
	 
	 for(int i=0;i<allfiles.length;i++)
	 {	   
	 FileInputStream fiobj=new FileInputStream(allfiles[i]);

	   name=allfiles[i].getName();
	   if(name.endsWith(".txt"))
	   {
         byte namearray[] = name.getBytes();
         writerobj.write(namearray,0,namearray.length);
		  
		 while((ret=fiobj.read(buffer))!=-1)
		 {
		     name = name +" ";
		 }
	   }
	 }
	}
	catch(Exception obj)
	{
	
	}
  }
  }