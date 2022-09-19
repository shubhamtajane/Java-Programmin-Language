import java.lang.*;
import java.util.*;

class program483
{
  public static void main(String arg[])
  {
   Scanner sobj=new Scanner(System.in);
   System.out.println("Enter Number of Elements");
   int iNo=sobj.nextInt();
   int Arr[]=new int[iNo];
   
   ArrayDemo aobj=new ArrayDemo();
   aobj.Difference(Arr);
  }
}

class ArrayDemo
{
 public void Difference(int Arr[])
  {
  Scanner sobj=new Scanner(System.in);
  System.out.println("Enter Elements");
   for(int i=0;i<Arr.length;i++)
  {
     Arr[i]=sobj.nextInt();
  }
  
 for(int i=0;i<Arr.length;i++)
  {
    if((Arr[i]%5==0)&&(Arr[i]%2==0))  
	{
	  System.out.print(Arr[i]+" ");
	}
  }
 }
}