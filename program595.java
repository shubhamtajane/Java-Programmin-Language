import java.lang.*;
import java.util.*;

class program595
{
  public static void main(String arg[])
  {
   Scanner sobj=new Scanner(System.in);
   System.out.println("Enter how many student required result");
   int No=sobj.nextInt();
   float Arr[]=new float[No];
   
   MyArray mobj=new MyArray();
   mobj.Percentage(Arr);
  }
}

class MyArray
{
  public void Percentage(float arr[])
  {
    Scanner sobj=new Scanner(System.in);
	System.out.println("Enter Percentage");
	for(int i=0;i<arr.length;i++)
	{
	  arr[i]=sobj.nextFloat();
	}
	
     for(int i=0;i<arr.length;i++)
	 { 
	   if(arr[i]<=35)
	   {
	     System.out.println(arr[i]+" "+"Fail");
	   }
	   else if((arr[i]>35)&&(arr[i]<=50))
	   {
	     System.out.println(arr[i]+" "+"Pass class");
	   }
	   else if((arr[i]>50)&&(arr[i]<=60))
	   {
	     System.out.println(arr[i]+" "+"Second class");
	   }
	   else if((arr[i]>60)&&(arr[i]<=70))
	   {
	     System.out.println(arr[i]+" "+"First class");
	   }
	   else if((arr[i]>70)&&(arr[i]<=100))
	   {
	    System.out.println(arr[i]+" "+"First class with Distinction");
	   }
	 }
}
}
    