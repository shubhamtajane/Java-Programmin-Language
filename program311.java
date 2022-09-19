import java.lang.*;
import java.util.*;

class program311
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	
	System.out.println("Enter Number");
	int Value=sobj.nextInt();
	
	Bitwise bobj=new Bitwise();
	int iRet=bobj.ChkOffBit(Value);
	System.out.println("Updated Number is: "+iRet);
	
   }
 }
 
 class Bitwise
 { 
   public int ChkOffBit(int iNo)
   {
     int iMask=0X00000040;
	 int iResult=0;
	 
	 iResult=iNo^iMask;
	 
	 return iResult;
	}
}
	 