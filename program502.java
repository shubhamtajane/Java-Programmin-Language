import java.lang.*;
import java.util.*;

class program502
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Elements");
	int iNo=sobj.nextInt();
	int Arr[]=new int[iNo];
	
	System.out.println("Enter Number for Search");
	int Value=sobj.nextInt(); 
	
	Number nobj=new Number();
	int iRet=nobj.FirstOcc(Arr,Value);
	System.out.println(iRet);
  }
}

class Number
{
 public int FirstOcc(int Arr[],int iNo)
 { 
     int iCnt=0;
   Scanner sobj=new Scanner(System.in);
   System.out.println("Enter Elements");
   for(int i=0;i<Arr.length;i++)
   {
     Arr[i]=sobj.nextInt();
   }
   
   for(int i=0;i<Arr.length;i++)
   {
     if(Arr[i]==iNo)
	 {
        iCnt=i;
		return iCnt;
	 }
   }
   return -1;
  }
}