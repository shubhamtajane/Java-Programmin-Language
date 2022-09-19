import java.lang.*;
import java.util.*;

class program564
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Rows");
	int iNo1=sobj.nextInt();
	
	System.out.println("Enter Number of Colums");
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
	for(i=1;i<=iRow;i++)
	{
	  for(j=iCol;j>=1;j--)
	  {
	    if((i==1)||(i==iRow)||(j==1)||(j==iCol)||(i==j))
		{
		  System.out.print("*"+" ");
		}
		else if(i>j)
		{
		  System.out.print("$"+" ");
		}
		else
		{
		  System.out.print("#"+" ");
		}
	 }
	 System.out.println();
   }
 }
}