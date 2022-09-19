import java.lang.*;
import java.util.*;

class program312
{
  public static void main(String arg[])
  {
   Scanner sobj=new Scanner(System.in);
   
   System.out.println("Enter Number");
    int Value=sobj.nextInt();
	
	Bitwise bobj=new Bitwise();
	 int iRet=bobj.OffBit(Value);
	 System.out.println("Updated Number is : "+iRet);
   }
 }
 
 class Bitwise
 {
   public int OffBit(int iNo)
   {
   int iMask=0X00000240;
   int iResult=0;
   
   iResult=iNo^iMask;
   
   
   return iResult;
 }
 }