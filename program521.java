import java.lang.*;
import java.util.*;


class program521
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
  public void Display(int iRow,int iCol)
  {
     int i=0,j=0;
	 char ch= '\0';
	 for(i=1;i<=iRow;i++)
	 {
	   for(j=1,ch='A';j<=iCol;j++,ch++)
	   {
	  System.out.print(ch+" ");
	   }
	   System.out.println();
     }  
  }
}
   