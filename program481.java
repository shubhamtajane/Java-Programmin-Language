import java.lang.*;
import java.util.*;

class program481
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Elements");
	int iNo=sobj.nextInt();
	int Arr[]=new int[iNo];
	
    ArrayDemo aobj=new ArrayDemo();
	int iRet=aobj.Difference(Arr);
	System.out.println("Summation of Odd Element is "+iRet);
  }
}

class ArrayDemo
{
  public int Difference(int Arr[])
  {
  Scanner sobj=new Scanner(System.in);
  System.out.println("Enter Elements");
	for(int i=0;i<Arr.length;i++)
	{
	  Arr[i]=sobj.nextInt();
	 }
  int Even=0,Odd=0,result=0;
    for(int i=0;i<Arr.length;i++)
	{
	  if(Arr[i]%2==0)
	  {
	    Even=Even+Arr[i];
      }
	  else
	  { 
	   Odd=Odd+Arr[i];
	  }
	}
	
   return Even-Odd;
 }
}