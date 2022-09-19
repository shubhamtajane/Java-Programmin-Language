import java.lang.*;
import java.util.*;

class program493
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number");
	int iNo=sobj.nextInt();
	
	Digit dobj=new Digit();
	int iRet=dobj.CountRange(iNo);
	System.out.println(iRet);
  }
}

class Digit
{
 public int CountRange(int iNo)
 { 
 int iCnt=0,iDigit=0;
   if(iNo<0)
   {
     iNo=-iNo;
   }
   while(iNo>0)
   {
     iDigit=iNo%10;
	 if((iDigit>3)&&(iDigit<7))
	 {
	   iCnt++;
	 }
	iNo=iNo/10;
    }
	return iCnt;
  }
}