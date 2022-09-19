import java.lang.*;
import java.util.*;

class program492
{
  public static void main(String arg[])
  {
   Scanner sobj=new Scanner(System.in);
   System.out.println("Enter Number");
   int iNo=sobj.nextInt();
   
   Digit dobj=new Digit();
   int iRet=dobj.CountOdd(iNo);
   System.out.println(iRet);
   
  }
}

class Digit
{
  public int CountOdd(int iNo)
  {
  int iDigit=0,iCnt=0;
    if(iNo<0)
	{
	  iNo=-iNo;
	}
	while(iNo>0)
	{
	  iDigit=iNo%10;
	  if((iDigit%2)!=0)
	  {
	   iCnt++;
	  }
	  iNo=iNo/10;
	}
	return iCnt;
  }
}

	 