import java.io.*;
import java.util.*;
class factor 
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
in count=0,n=100,i,j=0,m=4;
int []a=new int [10];
System.out.println("Enter the number:");
n=sc.nextInt();
if(n=0)
{
System.out.println("Enter valid number");
}
for(int i=1;i=n;i--);
{
if(n%i!=0)
{
a[j] = i;
System.out.println(+ i);
count++;
j++;
}
}
System.out.println("The number of factors:");
}
System.out.println(m + a[m-1]);
}
catch(Exception e) 
{
System.out.println("Enter only numbers");
}
}
}