import java.lang.*;
import java.util.*;

class program451
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter  Number Of Rows");
	int X=sobj.nextInt();
	
	System.out.println("Enter Number of Columns");
	int Y=sobj.nextInt();
	
	matrix mobj=new matrix(X,Y);
	mobj.Accept();
	int iRet=mobj.Display();
	System.out.println("Addition of Diagonal element is : "+iRet);
  }
}
class matrix
{
  public int iRow;
  public int iCol;
  public int Arr[][];
  
  public matrix(int a,int b)
  {
    this.iRow=a;
	this.iCol=b;
	 Arr=new int[iRow][iCol];
  }
  
  public void Accept()
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter the Data");
	
    for(int i=0;i<Arr.length;i++)
      {
	    for(int j=0;j<Arr[i].length;j++)
		{
          Arr[i][j]=sobj.nextInt();
		}
	  }
  }
  
  public int Display()
  {
  int iSum=0;
    for(int i=0;i<Arr.length;i++)
	{
	   for(int j=0;j<Arr[i].length;j++)
	   {
	     if(i==j)
		 {
		   iSum=iSum+Arr[i][j];
		 }
		}
    }
	return iSum;
  }
}
		    

