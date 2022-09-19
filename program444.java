import java.lang.*;
import java.io.*;
import java.util.*;

class program444
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
	 
	 System.out.println("Enter File Name");
	 String newfile=sobj.nextLine();
	 File fobj=new File(newfile);
	 
	 FileOutputStream foobj=new FileOutputStream(fobj);
	 boolean bobj=fobj.createNewFile();
	 byte buffer[]=new byte[100];
	 String name;
	 int ret=0;
	 
	 for(int i=0;i<allfiles.length;i++)
	 {
	            name=allfiles[i].getName();
	          if(name.endsWith(".txt"))
	          {
	            name=name+" ";
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
    