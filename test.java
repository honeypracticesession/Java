class test 
{

int a;
int b;
void meth(int i,int j)
{
i *=2;
j /=2;
}
}
class output
{


	public static void main(String[] args) 
	{
      test obj=new test();
       int a=10;
      int b=20;
    obj.meth(a,b);

		System.out.println(a+" "+b);
	}
}
