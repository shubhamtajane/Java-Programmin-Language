import java.lang.*;
import java.util.*;

class program472
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter String");
	String str=sobj.nextLine();
	char Arr[]=str.toCharArray();
	
	StringDemo dobj=new StringDemo();
	int iRet=dobj.CountSmall(Arr);
	System.out.println("Number of Small Characters are: "+iRet);

  }
}

class StringDemo
{
  public int CountSmall(char brr[])
  {
  int iCnt=0;
    for(int i=0;i<brr.length;i++)
	{
	  if((brr[i]>='a')&&(brr[i]<='z'))
	  {
	    iCnt++;
	  }
	}
	return iCnt;
 }
}
	