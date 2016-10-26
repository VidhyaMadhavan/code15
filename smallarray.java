import java.io.*;
import java.util.*;
class smallarray
{
public static void main(String args[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n,count=0;
System.out.println("Enter the size:");
n=sc.nextInt();
int b[]=new int[n];
int a[]=new int[n];
int smallest=0,secondsmall=0;
System.out.println("Enter the array elements:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
System.out.println("Second smallest number:"+a[1]);
}
}
