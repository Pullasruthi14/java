import java.io.*;
import java.util.*;
class R192111477
{
public static void main(String args[])
{
int number=123456,rev=0;
while(number!=0)
{
int remainder= number%10;
rev=rev*10+remainder;
number=number/10;}
System.out.println("the reverse of the given number is :"+rev);
}
}