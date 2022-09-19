import java.lang.*;
import java.util.*;

class program503
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Elements");
	int iNo1=sobj.nextInt();
	int Arr[]=new int[iNo1];
	
	System.out.println("Enter Number for Search");
	int Value=sobj.nextInt();
	
	Number nobj=new Number();
	int iRet=nobj.LastOcc(Arr,Value);
	System.out.println(iRet);
  }
}

class Number
{
  public int LastOcc(int Arr[],int iNo)
  {
     Scanner sobj=new Scanner(System.in);
	 System.out.println("Enter Elements");
	 for(int i=0;i<Arr.length;i++)
	 {
	   Arr[i]=sobj.nextInt();
	 }
	   int i=0,iCnt=0;
	 for(i=Arr.length-1;i>=0;i--)
	 { 
	    if(Arr[i]==iNo)
		{
	    iCnt=i;
		return iCnt;
	    }
	 }
	  return -1;
  }
 }