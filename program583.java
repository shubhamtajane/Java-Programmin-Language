import java.lang.*;
import java.util.*;

class program583
{
    public static void main(String arg[])
	{
	Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Elements of First array");
	int iNo1=sobj.nextInt();
	int arr[]=new int[iNo1];
	
	
	MyArray mobj=new MyArray();
	int []a=mobj.CopyArrayRev(arr);
	
for (int i =a.length-1; i>=0; i--) 
System.out.print( a[i]+ " ");     
}  
}

class MyArray
{
  public int[] CopyArrayRev(int Arr1[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Elements of first Array");
	for(int i=0;i<Arr1.length;i++)
	{
	  Arr1[i]=sobj.nextInt();
	}
	  
	int crr[]=new int[Arr1.length];
	crr=Arr1;
	
	return crr;
  }
}