import java.lang.*;
import java.util.*;

class program334
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);  // 9th July

        System.out.println("Enter number ");
        int No = sobj.nextInt();
        
		System.out.println("Enter position1 ");
        int Pos1 = sobj.nextInt();

		System.out.println("Enter position2 ");
        int Pos2 = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        boolean iRet = bobj.ChkBit(No,Pos1,Pos2);
		
        if(iRet==true)
		{
		  System.out.println("TRUE");
		 }
		 else
		 {
		  System.out.println("False");
		 }
    }
}


class Bitwise      
{
        public boolean ChkBit(int iNo,int iPos1,int iPos2)
        {
            int iMask = 0X00000001;
            int iResult = 0;
 
            iMask=iMask<<((iPos1-1)|(iPos2-1));
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

