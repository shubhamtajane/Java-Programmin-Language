import java.lang.*;
import java.util.*;
import java.io.*;

class program422
{
   public static void main(String arg[])throws IOException
   {
    Scanner sc=new Scanner(System.in);
	System.out.println("enter file name");
	String fname=sc.nextLine();
	String line = null;
	
            FileReader fileReader = new FileReader(fname);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
   }
}