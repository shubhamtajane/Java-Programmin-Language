import java.lang.*;
import java.util.*;

class program541
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter String");
	String str=sobj.nextLine();
	
	char Arr[]=str.toCharArray();
	Pattern pobj=new Pattern();
	pobj.Display(Arr);
	
  }
}

class Pattern
{
  public void Display(char Brr[])
  {
    for(int i=0;i<Brr.length;i++)
	{
	  for(int j=0;j<Brr.length;j++)
	  {
	    System.out.print(Brr[j]+" ");
	  }
	  System.out.println();
	}
  }
}