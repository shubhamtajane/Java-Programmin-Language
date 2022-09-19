import java.lang.*;
import java.util.*;

class program573
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Elements of First Array");
	int iNo1=sobj.nextInt();
	int arr[]=new int[iNo1];
	
	System.out.println("Enter Number of Elements of Second Array are");
	int iNo2=sobj.nextInt();
	int brr[]=new int[iNo2];
	
	MyArray mobj=new MyArray();
	mobj.DisplayOdd(arr,brr);
   }
}

class MyArray
{
  public void DisplayOdd(int Arr1[],int Arr2[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Elements of First array");
	for(int i=0;i<Arr1.length;i++)
	{
	  Arr1[i]=sobj.nextInt();
	}
	
	System.out.println("Odd Elemets of Fist array are");
	for(int i=0;i<Arr1.length;i++)
	{
	  if(Arr1[i]%2!=0)
	  {
	    System.out.print(Arr1[i]+" ");
      }
	}
	System.out.println();
	
	System.out.println("Enter Elements of Second Array are");
	for(int j=0;j<Arr2.length;j++)
	{
	  Arr2[j]=sobj.nextInt();
	}
	
	
	System.out.println("Odd Elements of Second array are");
	for(int j=0;j<Arr2.length;j++)
	{ 
	  if(Arr2[j]%2!=0)
	   {
	
	   System.out.print(Arr2[j]+" ");
	   }
	}
  }
}