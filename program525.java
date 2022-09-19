import java.lang.*;
import java.util.*;

class program525
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Rows");
	int iNo1=sobj.nextInt();
	
	System.out.println("Enter Number of Columns");
	int iNo2=sobj.nextInt();
	
	Pattern pobj=new Pattern();
	pobj.Display(iNo1,iNo2);
  
  }
}

class Pattern
{
  int i=0,j=0,No=0;
  public void Display(int iRow,int iCol)
  {
     for(i=1;i<=iRow;i++)
    {
       for(j=1;j<=iCol;j++)
	   {
	   No++;
	   System.out.print(No+" " );
	}
	System.out.println();
  }
}
}