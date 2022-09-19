
import java.io.FileWriter;
import java.util.*;
import java.io.*;
class program423
{
	public static void main(String[] args) throws IOException
	{
	Scanner sobj= new Scanner(System.in);
	System.out.println("enter File name ");
	String fname=sobj.nextLine();
	
	System.out.println("Enter the Data");
	String data=sobj.nextLine();
		FileWriter fw=new FileWriter(fname);
         fw.write(data);

		System.out.println("Writing successful");
		//close the file
		fw.close();
	}
}
