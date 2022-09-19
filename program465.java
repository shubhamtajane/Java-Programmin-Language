import java.lang.*;
import java.util.*;



class program465
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Rows");
	int X=sobj.nextInt();
	
	System.out.println("Enter Number of Columns");
	int Y=sobj.nextInt();
	
	Matrix mobj=new Matrix(X,Y);
	mobj.Accept();
	mobj.ChkSparse();

  }
}

class Matrix
{
 public int iRow;
 public int iCol;
 public int Arr[][];
 
 public Matrix(int a,int b)
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

public void ChkSparse()
{
int iCnt=0;
int ijnt=0;
  for(int i=0;i<Arr.length;i++)
   { 
     for(int j=0;j<Arr[i].length;j++)
	 {
	   if(Arr[i][j]==0)
	   {
	     iCnt++;
	   }
	   else if(Arr[i][j]!=0)
	   {
	     ijnt++;
	   }
	  }
	}
	
	if(iCnt<ijnt)
	{
	  System.out.println("False");
	 }
	 else
	 {
	  System.out.println("TRUE");
	 }


}
}

