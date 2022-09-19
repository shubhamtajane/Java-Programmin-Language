import java.lang.*;
import java.util.*;

class program581
{
    public static void main(String arg[])
	{
	Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Elements of First array");
	int iNo1=sobj.nextInt();
	int arr[]=new int[iNo1];
	
	System.out.println("Enter Number if Elements of Second Array");
	int iNo2=sobj.nextInt();
	int brr[]=new int[iNo2];
	
	MyArray mobj=new MyArray();
	int iRet=mobj.DiffArray(arr,brr);
	System.out.println("Difference is : "+iRet);
	
	
  }
}

class MyArray
{
  public int DiffArray(int Arr1[],int Arr2[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Elements of first Array");
	for(int i=0;i<Arr1.length;i++)
	{
	  Arr1[i]=sobj.nextInt();
	}
	
	int Sum=0;
	for(int i=0;i<Arr1.length;i++)
    {
	  Sum=Sum+Arr1[i];
	}
	
	System.out.println("Enter Elements of Second Array");
	 for(int j=0;j<Arr2.length;j++)
	 {
	   Arr2[j]=sobj.nextInt();
	 }
	 
	 int Sum1=0,Result=0;
	 for(int j=0;j<Arr2.length;j++)
	 {
	   Sum1=Sum1+Arr2[j];
	 }
	 Result=Sum-Sum1;
	 return Result;
  }
}