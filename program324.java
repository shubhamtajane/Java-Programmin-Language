import java.lang.*;
import java.util.*;

class program324
{
  public static void main(String arg[])
  {
   Scanner sobj=new Scanner(System.in);
   
   System.out.println("Enter Number");
    int iValue1=sobj.nextInt();
	
	System.out.println("Enter Position");
	int iValue2=sobj.nextInt();
	
	Bitwise bobj=new Bitwise();
	int bRet=bobj.ToggleBit(iValue1,iValue2);
	
    System.out.println("Updated Number is:"+bRet);
	 }
}
	 
	 class Bitwise
	 {
	   public int ToggleBit(int iNo,int iPos)
	   {
	    int iMask=0X00000001;
		
		int iResult=0;
		
		iMask=iMask<<(iPos-1);
		iResult=iNo^iMask;
		return iResult;
	   }
		}