class Program 
{
 int num1=3;
  static int num2=5;
Program(int num1,int num2)
{
if(num2<30)
{this.num2=num2;
}
num1=num1;
}
	public static void main(String[] args) 
	{
		Program s1=new Program(9,10);
    Program s2=new Program(12,22);
   System.out.println(s1.num1 +"" +s1.num2 +" " +s2.num1 +"  " +s2.num2);
}
}
