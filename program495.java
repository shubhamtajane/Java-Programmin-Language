import java.lang.*;
import java.util.*;

class program495
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number");
	int iNo=sobj.nextInt();
	
	Digit dobj=new Digit();
	int iRet=dobj.CountDiff(iNo);
	System.out.println(iRet);
   }
}

class Digit
{
  public int CountDiff(int iNo)
  {
    int iDigit=0;
 int iSum=0;
  int iSub=0;
  int iDiff=0;
  
 while(iNo!=0)
 {
  iDigit=iNo%10;
  if(iDigit%2==0)
  {
    iSum=iSum+iDigit;
   }
  else
  {
     iSub=iSub+iDigit;
   }
  iDiff=iSum-iSub;
  iNo=iNo/10;
 }
 return iDiff;
 }
}
	  