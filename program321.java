import java.lang.*;
import java.util.*;

class program321
{
  public static void main(String arg[])
  {
   Scanner sobj=new Scanner(System.in);
   
   System.out.println("Enter Number");
    int iValue1=sobj.nextInt();
	
	System.out.println("Enter Position");
	int iValue2=sobj.nextInt();
	
	Bitwise bobj=new Bitwise();
	boolean bRet=bobj.ChkBit(iValue1,iValue2);
	
	if(bRet==true)
	{
	  System.out.println("True");
	 }
	 else
	 {
	  System.out.println("False");
	 }
	  }
	 }
	 
	 class Bitwise
	 {
	   public boolean ChkBit(int iNo,int iPos)
	   {
	    int iMask=0X00000001;
		int iResult=0;
		
		iMask=iMask<<(iPos-1);
		iResult=iNo&iMask;
		if(iResult==0)
		{
		  return false;
		 }
		 else
		 {
		 return true;
		  }
	   }
	   }
		