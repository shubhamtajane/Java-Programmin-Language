import java.lang.*;
import java.util.*;

class program594
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Characters");
	int iNo1=sobj.nextInt();
	char Arr[]=new char[iNo1];
	
	MyArray mobj=new MyArray();
	int iRet=mobj.ArrayCapital(Arr);
	System.out.println("Number of Capital Letters are: "+iRet);
  }
}

class MyArray
{
  public int ArrayCapital(char arr[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Characters");

	for(int i=0;i<arr.length;i++)
	{
	 arr[i]=sobj.next().charAt(0);
	}
	int iCnt=0;
	for(int i=0;i<arr.length;i++)
	{
	  if((arr[i]>='A')&&(arr[i]<='Z'))
	  {
	   iCnt++;
	  }
	}
	return iCnt;
  }
}
  
    