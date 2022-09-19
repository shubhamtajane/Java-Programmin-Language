import java.io.*;
import java.lang.*;


public class program425
 {
   public static void main(String args[]) throws IOException 
   {
 
      File directoryPath = new File("C:\\Users\\Shubham Tajane\\Desktop\\LBAS\\Demo");
     
      String contents[] = directoryPath.list();
      System.out.println("List of files and directories in the specified directory:");
	  
      for(int i=0; i<contents.length; i++)
	  {
         System.out.println(contents[i]);
      }
   }
}