import java.util.*;
public class subset
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int x,y,z=0;
n=sc.nextInt();
m=sc.nextInt();
int a[]=new int[n];
int b[]=new int[m];
for(int x=0;x<n;x++)
a[i]=sc.nextInt();
for(int y=0;y<m;y++)
b[j]=sc.nextInt();

for(int x=0;x<b.length;x++)
{
for(int y=0;y<a.length;y++)
{
if(b[x]==a[y])
z++;
}
}
if(z==b.length)
System.out.println(" array b is a subset of array a");
else
System.out.println("not");
}
}