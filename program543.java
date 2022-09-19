import java.lang.*;
import java.util.*;

class program543
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
    int i=0,j=0;
    for(i=0;i<Brr.length;i++)
	{
	  for(j=0;j<=i;j++)
	  {
	   System.out.print(Brr[j]+" ");
	  }
	  System.out.println();
	}
  }
}