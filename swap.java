class TwoGenerics<T>
{
T a;
T b;
TwoGenerics(T a1,T b1)
{
a=a1;
b=b1;
}
void swap()
{
T c=a;
a=b;
b=c;
}
void print()
{
System.out.println(a);
System.out.println(b);
}
}class GDemo
{
public static void main(String args[])
{
TwoGenerics<Integer>obj=new TwoGenerics<Integer>(40,50);
System.out.println("before Swapping");
obj.print();
System.out.println("after swapping");
obj.swap();
obj.print();
}
}

