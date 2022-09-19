import java.lang.*;
import java.util.*;

class program505
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Elements");
	int iNo1=sobj.nextInt();
	int Arr[]=new int[iNo1];
	
	Number nobj=new Number();
	int iRet=nobj.Product(Arr);
	System.out.println(iRet);
  }
}

class Number
{
  public int Product(int Arr[])
  { 
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Elements");
	for(int i=0;i<Arr.length;i++)
	{
	  Arr[i]=sobj.nextInt();
	}
	int iProd=1;
	for(int i=0;i<Arr.length;i++)
	{
	  if(Arr[i]%2!=0)
	  {
	    iProd=iProd*Arr[i];
	  }
	}
	return iProd;
  }
}
