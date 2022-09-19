import java.lang.*;
import java.util.*;

class program333
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);  // 9th July

        System.out.println("Enter number ");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        boolean iRet = bobj.ChkBit(value);
        if(iRet==true)
		{
		  System.out.println("TRUE");
		 }
		 else
		 {
		  System.out.println("TRUE");
		 }
    }
}


class Bitwise      
{
        public boolean ChkBit(int iNo)
        {
            int iMask = 0X00000880;
            int iResult = 0;

            iResult = iNo ^ iMask;
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

