import java.lang.*;
import java.util.*;

class program582
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
	mobj.MinArray(arr,brr);
	
	
	
  }
}

class MyArray
{
  public void MinArray(int Arr1[],int Arr2[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Elements of first Array");
	for(int i=0;i<Arr1.length;i++)
	{
	  Arr1[i]=sobj.nextInt();
	}
	
	int iMin=Arr1[0];
	int iNo=0;
	for(int i=0;i<Arr1.length;i++)
    {
	  if(Arr1[i]<iMin)
	  {
	    iMin=Arr1[i];
	}
	}
	System.out.println("Small Valaue of first Array is: "+iMin);
	
	System.out.println("Enter Elements of Second Array");
	 for(int j=0;j<Arr2.length;j++)
	 {
	   Arr2[j]=sobj.nextInt();
	 }
	 
	 int No2=0,iMin1=Arr2[0];
	 for(int j=0;j<Arr2.length;j++)
	 {
	  if(Arr2[j]<iMin1)
	  {
	    iMin1=Arr2[j];
	  }
	  
	 }
	System.out.println("Small Value of Second Array is: "+iMin1);
	
  }
}