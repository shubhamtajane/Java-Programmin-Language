import java.lang.*;
import java.util.*;

class program522
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Rows");
	int iNo1=sobj.nextInt();
	
	System.out.println("Entetr Number of Columns");
	int iNo2=sobj.nextInt();
	
	Pattern pobj=new Pattern();
	pobj.Pattern(iNo1,iNo2);
  }
}

class Pattern
{
  public void Pattern(int iRow,int iCol)
  {
    int i=0,j=0;
	char ch='\0',ch1='\0';
    for(i=1;i<=iRow;i++)
	{
	  for(j=0,ch='A',ch1='a';j<iCol;j++,ch++,ch1++)
	  { 
	    if((i==1)||(i==3))
		{
		  System.out.print(ch+" ");
		 }
		 else
		 {
		 System.out.print(ch1+" ");
		 }
	   }
	   System.out.println();
	}
   }
}