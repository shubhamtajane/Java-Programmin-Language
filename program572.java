import java.lang.*;
import java.util.*;

class program572
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Elemets of Firstg array");
	int iNo1=sobj.nextInt();
	int arr[]=new int[iNo1];
	
	System.out.println("Enter Number of Elemets of Second Array");
	int iNo2=sobj.nextInt();
	int brr[]=new int[iNo2];
	
	MyArray mobj=new MyArray();
	mobj.DisplayEven(arr,brr);
  }
}

class MyArray
{
  public void DisplayEven(int Arr1[],int Arr2[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Elementsof First Array");
	for(int i=0;i<Arr1.length;i++)
	{
	  Arr1[i]=sobj.nextInt();
	}
	
	System.out.println("Even Elements of Array are");
	for(int i=0;i<Arr1.length;i++)
	{
	   if(Arr1[i]%2==0)
	   {
	     System.out.print(Arr1[i]+ " ");
	    }
    }
	System.out.println();
	System.out.println("Enter Elemets of Second Array are");
	for(int j=0;j<Arr2.length;j++)
	{
	  Arr2[j]=sobj.nextInt();
	}
	System.out.println("Even Elements if Second array are");
	for(int j=0;j<Arr2.length;j++)
	{
	    if(Arr2[j]%2==0)
		{
		  System.out.print(Arr2[j]+" ");
		}
	}
  }
}