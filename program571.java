import java.lang.*;
import java.util.*;

class program571
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Elemets of first Array");
	int iNo1=sobj.nextInt();
	int arr[]=new int[iNo1];
	
	
	System.out.println("Enter Number of Elemets of Second Array");
	int iNo2=sobj.nextInt();
	int brr[]=new int[iNo2];
	
	MyArray mobj=new MyArray();
	mobj.Display(arr,brr);
	
  }
}

class MyArray
{
 public void Display(int Arr1[],int Arr2[])
 {
    Scanner sobj=new Scanner(System.in);
   System.out.println("Enter Elements of First Array");
	int i=0;
	for(i=0;i<Arr1.length;i++)
	{
	  Arr1[i]=sobj.nextInt();
	}
	System.out.println("Enter Elements of First array are");
   for(i=0;i<Arr1.length;i++)
   {
     System.out.println(Arr1[i]);
   }
   
    System.out.println("Enter Elements of Second Array");
	int j=0;
	for(j=0;j<Arr2.length;j++)
	{
	  Arr2[j]=sobj.nextInt();
	}
	
   	System.out.println("Enter Elements of Second array are");
   for(i=0;i<Arr2.length;i++)
   {
     System.out.println(Arr2[i]);
   }
   
   }
 
 
 
 
 }