import java.util.*;
public class string
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the first string");
        String str1=sc.nextLine();
        System.out.print("enter the second string");
        String str2=sc.nextLine();
        System.out.print("enter a character to perform index operation");
        char ch=sc.next().charAt(0);
        System.out.println("index of" + ch + " in str1:" + str1.indexOf(ch));
        if(str1.compareTo(str2)==0)
           System.out.println("Strings are equal");
        else
           System.out.println("Strings are not equal");
        String str3=str1.concat(" ").concat(str2);
        System.out.println(str3);
    }
}