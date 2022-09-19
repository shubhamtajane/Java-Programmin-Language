import java.lang.*;
import java.util.*;

class program592
{
  public static void main(String arg[])
  {
   Scanner sobj=new Scanner(System.in);
   System.out.println("Enter Number of Elements");
   int iNo1=sobj.nextInt();
   int Arr[]=new int[iNo1];
   
   MyArray mobj=new MyArray();
   mobj.SumArray(Arr);
   
  }
}

class MyArray
{
  public void SumArray(int arr[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Elements");
	for(int i=0;i<arr.length;i++)
	{
	  arr[i]=sobj.nextInt();
	}
	 int iSum=0,iDigit=0;
	for(int i=0;i<arr.length;i++)
	{
	  while(arr[i]>0)
	  { 
	    iDigit=arr[i]%10;
		iSum=iSum+iDigit;
		arr[i]=arr[i]/10;
      }	   
	   System.out.print(iSum+" ");
       iSum=0;
	}
 
 }
}