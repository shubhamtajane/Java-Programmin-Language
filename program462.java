import java.lang.*;
import java.util.*;


class program462
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
   System.out.println("Enter the data");
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
  int j=0;
   for(int i=0;i<Arr.length;i++)
   { 
     for(j=Arr[i].length-1;j>=0;j--)
	 {
	   System.out.print(Arr[i][j]+" "); 
	 }
     System.out.println();
   }
 }
}
  



   