import java.lang.*;
import java.util.*;

class program504
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Number of Elements");
	int iNo1=sobj.nextInt();
	int Arr[]=new int[iNo1];
	
	System.out.println("Enter Starting Range");
	int Value1=sobj.nextInt();
	
	System.out.println("Enter Ending Range");
	int Value2=sobj.nextInt();
 
    Number nobj=new Number();
	nobj.Display(Arr,Value1,Value2);
  }
}

class Number
{
 public void Display(int Arr[],int iStart,int iEnd)
 {
   Scanner sobj=new Scanner(System.in);
   System.out.println("Enter Elements");
   for(int i=0;i<Arr.length;i++)
   {
     Arr[i]=sobj.nextInt();
   }
   
   for(int i=0;i<Arr.length;i++)
   {
      if((Arr[i]>=iStart)&&(Arr[i]<=iEnd))
	  {
	    System.out.print(Arr[i]+" ");
	  }
	}
 }
}