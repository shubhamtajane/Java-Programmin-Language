import java.lang.*;
import java.util.*;

class program295
{
  public static void main(String arg[])
  { 
    Scanner sobj=new Scanner(System.in);
	
	System.out.println("Enter Number");
	int Value=sobj.nextInt();
	
	Bitwise bobj=new Bitwise();
	boolean bRet=bobj.ChkBit(Value);
	
    if(bRet==true)
	{
	 System.out.println("Bit is On");
	 }
	 else
	{
	  System.out.println("Bit is Off");
	}
  }
}

class Bitwise
{
  public boolean ChkBit(int iNo)
  {
    int iMask=0X80000001;
	int iResult=0;
	
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