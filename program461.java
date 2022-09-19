import java.lang.*;
import java.util.*;


class program461
{
 public static void main(String arg[])
 {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Rows");
	int X=sobj.nextInt();
	
	System.out.println("Enter Number of Columns");
	int Y=sobj.nextInt();
	
	matrix mobj=new matrix(X,Y);
	mobj.Accept();
	mobj.Display();
	
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
 
 

  public void Display()
  {
  for(int i=0;i<Arr.length;i++)
  {
    for(int j=0;j<Arr[i].length;j++)
	{
	  System.out.print(Arr[j][i]+" ");
	 }
	 System.out.println();
}
   }
   
}



