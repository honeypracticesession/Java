class Mainclass 
{
	public static void main(String[] args) 
	{
		Upcast a1=(Upcast)new Do();
        a1.run();
        Do d1=(Do) a1;
        d1.run();
        d1.test();
	}
}
