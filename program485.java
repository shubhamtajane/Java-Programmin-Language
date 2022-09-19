import java.lang.*;
import java.util.*;

class program485
{
  public static void main(String arg[])
  {
   Scanner sobj=new Scanner(System.in);
   System.out.println("Enter Number of Elements");
   int iNo=sobj.nextInt();
   int Arr[]=new int[iNo];
   
   ArrayDemo aobj=new ArrayDemo();
   aobj.Display(Arr);
   
   }
 }
 
 class ArrayDemo
 {
   public void Display(int Arr[])
   {
     Scanner sobj=new Scanner(System.in);
	 System.out.println("Eneter Elements");
	 for(int i=0;i<Arr.length;i++)
	 {
	   Arr[i]=sobj.nextInt();
	 }
	 
	 for(int i=0;i<Arr.length;i++)
	 {
	   if((Arr[i]%11)==0)
	   {
	     System.out.print(Arr[i]+" ");
	   }
	 }
  }
}
	 