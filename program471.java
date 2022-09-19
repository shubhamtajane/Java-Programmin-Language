import java.lang.*;
import java.util.*;

class program471
{
  public static void main(String arg[])
  {
   Scanner sobj=new Scanner(System.in);
   System.out.println("Enter String");
   String str=sobj.nextLine();
   char Arr[]=str.toCharArray();
   
    StringDemo dobj=new StringDemo();
	int iRet=dobj.CountCapital(Arr);
	System.out.println("Number of Capital Letters are:"+iRet);

  }
}

class StringDemo
{
  public int CountCapital(char brr[])
  {
    int iCnt=0;
    for(int i=0;i<brr.length;i++)
	{
	  if((brr[i]>='A')&&(brr[i]<='Z'))
	  {
	    iCnt++;
	  }
	}
	return iCnt;
  }
 }