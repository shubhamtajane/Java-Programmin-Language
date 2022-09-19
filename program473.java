import java.lang.*;
import java.util.*;

class prgoram473
{
  public static void main(String arg[])
  {  
  Scanner sobj=new Scanner(System.in);
  System.out.println("Enter String");
  String str=sobj.nextLine();
  char Arr[]=str.toCharArray();
  
  StringDemo dobj=new StringDemo();
  int iRet=dobj.CountDiff(Arr);
  System.out.println("Difference is: "+iRet);
  }
}

class StringDemo
{
  public int CountDiff(char brr[])
  {
    int iCnt=0,iCnt1=0,iDiff=0;
    for(int i=0;i<brr.length;i++)
	{
	  if((brr[i]>='A')&&(brr[i]<='Z'))
	  {
	   iCnt++;
	  }
	  else
	  {
	  iCnt1++;
	  }
	}
	iDiff=iCnt1-iCnt;
	return iDiff;
  }
}