import java.util.*;

public class DisticntElements 
{
public static void printDistinctElements(int[] arr)
{
for(int n=0;n<arr.length;n++)
{
boolean isDistinct = false;
for(int m=0;m<n;m++)
{
if(arr[n] == arr[m])
{
isDistinct = true;
break;
}
}
if(!isDistinct)
{
System.out.print(arr[n]+" ");
}
}
}
     
public static void main(String a[])
{
DisticntElements de=new DisticntElements();
int k;
System.out.println("Enter total no of values in the array");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
for(n=0;n<k;n++)
a[n]=s.nextInt();
de.printDistinctElements(a);
}
}