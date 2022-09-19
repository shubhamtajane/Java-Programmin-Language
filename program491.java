import java.lang.*;
import java.util.*;

class program491
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number");
	int iNo=sobj.nextInt();
	
	Digit dobj=new Digit();
	int iRet=dobj.CountEven(iNo);
	System.out.println(iRet);
	
  }
}

class Digit
{
  public int CountEven(int iNo)
  {
    int iCnt=0,iDigit=0;
     if(iNo<0)
	 {
	   iNo=-iNo;
	 }
	 while(iNo>0)
	 {
	   iDigit=iNo%10;
	  if((iDigit%2)==0)
	  {
	    iCnt++;
	  }
	   iNo=iNo/10;
	 }
	 return iCnt;
  }
}