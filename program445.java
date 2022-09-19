import java.lang.*;
import java.io.*;
import java.util.*;

class program445
{
  public static void main(String arg[])
  {
   try
   {
     Scanner sobj=new Scanner(System.in);
	 System.out.println("Enter Directory/Folder Name");
	 String foldername=sobj.nextLine();
	 File file=new File(foldername);
	 File allfiles[]=file.listFiles();
	 String name;
	 
	 System.out.println("Enter File Name");
	 String newfile=sobj.nextLine();
	 
	 File fobj=new File(newfile);
	 
	 boolean bobj=fobj.createNewFile();
	FileOutputStream foobj=new FileOutputStream(fobj);

	 byte buffer[]=new byte[100];
	 int ret=0;
	 
	 for(int i=0;i<allfiles.length;i++)
	 {
	   name=allfiles[i].getName();
	   if(name.endsWith(".txt"))
	   {
	     name=name+" "+(allfiles[i].length());
		  for(int j = name.length(); j<100; j++)
              {
                name = name + " ";
              }
		  byte namearray[] = name.getBytes();
          foobj.write(namearray,0,namearray.length);

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
	   