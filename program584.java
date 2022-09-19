import java.lang.*;
import java.util.*;

class program584
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Elements of Array");
	int iNo1=sobj.nextInt();
	int arr[]=new int[iNo1];
	
	MyArray mobj=new MyArray();
	int []a=mobj.CopyArray(arr);
	for(int i=0;i<a.length;i++)
	{ 
	  System.out.print(a[i]+" ");
	}
  }
}

class MyArray
{
  public int[] CopyArray(int Arr[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Elements");
	int i=0;
	for(i=0;i<Arr.length;i++)
	{
	  Arr[i]=sobj.nextInt();
	}
	
	int crr[]=new int[Arr.length];
	crr=Arr;
	return crr;
  }
}