import java.io.*;
import java.util.*;
class pat
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int n=input.nextInt();
for(int i=1;i<=n;i++)
{
int a=1;
for(int s=1;s<=n;s++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print(a+" ");
a=a*(i-j)/j;
}
System.out.println();
}
}
}