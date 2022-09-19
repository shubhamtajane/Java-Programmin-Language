import java.lang.*;
import java.io.*;
import java.util.*;

class program435
{
 public static void main(String arg[]) throws IOException
 {
   try
 {
   Scanner sobj=new Scanner(System.in);
   System.out.println("Enter Directory/Folder Name");
   String filename=sobj.nextLine();
   File file=new File(filename);
   String name;
   File allfiles[]=file.listFiles();
   
   
	 for(int i=0;i<allfiles.length;i++)
	 {
	   name=allfiles[i].getName();
	   if(name.endsWith(".txt"))
	   {
	     name=name+" "+allfiles[i].length();
		System.out.println(name);
	   }
    }
 }
 catch(Exception obj)
 {
 
 }
}
}