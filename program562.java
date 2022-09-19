import java.lang.*;
import java.util.*;

class program562
{
  public static void main (String arg[])
  { 
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter NUmber of Rows");
	int iNo1=sobj.nextInt();
	
	System.out.println("Enter Number of Columns");
	int iNo2=sobj.nextInt();
	
	Pattern pobj=new Pattern();
	pobj.Display(iNo1,iNo2);
  }
}

class Pattern
{
  public void Display(int iRow,int iCol)
  {
    int i=0,j=0;
	for(i=iRow;i>=1;i--)
	{
	  for(j=1;j<=iCol;j++)
	  {
	    if(i==j)
		{
		  System.out.print("#"+" ");
		}
		else if(i<j)
		{
		  System.out.print("@"+" ");
		}
		else
		{
		 System.out.print("*"+" ");
		}
	  }
	  System.out.println();
  }
 }
}
