class Overload 
{ 
public static void method(int a,double b)
{
System.out.println(a);
System.out.println(b);
}
public static void method (double a,int b)
{
System.out.println(a);
System.out.println(b);
}
public static void main(String[]args)
{
method(10,20.3);
method(2.5,10);
}
	
}
