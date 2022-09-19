import java.lang.*;
import java.util.*;

class program494
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number");
	int iNo=sobj.nextInt();
	
	Digit dobj=new Digit();
	int iRet=dobj.Multiply(iNo);
	System.out.println(iRet);
  }
}

class Digit
{
  public int Multiply(int iNo)
  { 
    int iDigit=0,iMult=1;
	if(iNo<0)
	{
	  iNo=-iNo;
	}
	while(iNo>0)
	{
	  iDigit=iNo%10;
	  iMult=iMult*iDigit;
	  iNo=iNo/10;
	}
	return iMult;
  }
}
