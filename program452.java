import java.lang.*;
import java.util.*;


class program452
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Rows");
	int X=sobj.nextInt();
	
	System.out.println("Enter Number of Columns");
	int Y=sobj.nextInt();
	
	System.out.println("Enter Number of searching Frequency");
	int Z=sobj.nextInt();
	
	matrix mobj=new matrix(X,Y,Z);
	mobj.Accept();
	int iRet=mobj.Display();
	System.out.println("Frequency of Number is: "+iRet);
	
  }
}

class matrix
{
  public int iRow;
  public int iCol;
  public int iNo;
  public int Arr[][];
  
  matrix(int a,int b,int c)
  {
    this.iRow=a;
	this.iCol=b;
	this.iNo=c;
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
	  int iCnt=0;
	  for(int i=0;i<Arr.length;i++)
	  {
	    for(int j=0;j<Arr[i].length;j++)
		{
		  if(Arr[i][j]==iNo)
		  {
		    iCnt++;
		  }
		 }
	  }
	  return iCnt;
	}
}
