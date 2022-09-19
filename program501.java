import java.lang.*;
import java.util.*;

class program501
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Elements");
	int iNo=sobj.nextInt();
	int Arr[]=new int[iNo];
	System.out.println("Enter Number that you want to Search");
	int Value=sobj.nextInt();
	
	Number nobj=new Number();
	boolean iRet=nobj.Check(Arr,Value);
	if(iRet==true)
	{
	  System.out.println("TRUE");
	}
	else
	{
	 System.out.println("FALSE");
	}
  }
}

class Number
{
 boolean Check(int Arr[],int iNo)
 {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Eneter Elements");
	for(int i=0;i<Arr.length;i++)
	{
	  Arr[i]=sobj.nextInt();
	}
	
	for(int i=0;i<Arr.length;i++)
	{
	  if(Arr[i]==iNo)
	  {
	    return true;
	  }
	}
	return false;
}
 }