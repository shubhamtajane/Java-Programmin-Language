import java.lang.*;
import java.util.*;

class program474
{
 public static void main(String arg[])
 {
   Scanner sobj=new Scanner(System.in);
   System.out.println("Enter String");
   String str=sobj.nextLine();
   char Arr[]=str.toCharArray();
   
   StringDemo dobj=new StringDemo();
   boolean iRet=dobj.ChkVowel(Arr);
    if(iRet==true)
    {
     System.out.println("TRUE");
	}
	else
	{
	System.out.println("FALSE");
	 }
 }
}
    
class StringDemo
{
 public boolean ChkVowel(char Arr[])
 {
   for(int i=0;i<Arr.length;i++)
   {
     if((Arr[i]=='a')||(Arr[i]=='e')||(Arr[i]=='i')||(Arr[i]=='o')||(Arr[i]=='u'))
	 {
	   return true;
	 }
   }
   return false;
 }
 }