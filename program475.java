import java.lang.*;
import java.util.*;

class program475
{
  public static void main(String arg[])
  {
   System.out.println("Enter String");
   Scanner sobj=new Scanner(System.in);
   String str=sobj.nextLine();
   char Arr[]=str.toCharArray();
  
   
   StringDemo dobj=new StringDemo();
   dobj.Reeverse(Arr);
   
  }
}

class StringDemo
{
  public void Reeverse(char Arr[])
  {
  int i=0;
   for(i=Arr.length-1;i>=0;i--)
   {
     System.out.print(Arr[i]);
   }
  }
}
   
   