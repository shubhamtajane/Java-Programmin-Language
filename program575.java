import java.lang.*;
import java.util.*;

class program575
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Elements in First Array");
	int iNo1=sobj.nextInt();
    int arr[]=new int[iNo1];
	
	System.out.println("Enter Number of Elements of Second array");
	int iNo2=sobj.nextInt();
	int brr[]=new int[iNo2];
	
	MyArray mobj=new MyArray();
	mobj.SumArray(arr,brr);
	
  }
}

class MyArray
{
  public void SumArray(int Arr1[],int Arr2[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter elements of first array");
	int i=0;
	for(i=0;i<Arr1.length;i++)
	{
	  Arr1[i]=sobj.nextInt();
	}
	
	
	int Sum=0;
	for(i=0;i<Arr1.length;i++)
	{
	  Sum=Sum+Arr1[i];
	}
    System.out.println("Sum of First array is: " +Sum);
	
	System.out.println("Enter Elements of Second Array");
	for(int j=0;j<Arr2.length;j++)
	{
	  Arr2[j]=sobj.nextInt();
	}
	

	int Sum1=0;
	for(int j=0;j<Arr2.length;j++)
	{
	  Sum1=Sum1+Arr2[j];
	}
	
		System.out.println("Sum of Second array is: " +Sum1);
  }
}