class Squareconstructor 
{   
  public int side;
    
public Squareconstructor(int side)
{
   this.side=side;
}
public void Area()
{
int A=side*side;
System.out.println("Area of the circle is :"+A);
}

 
	public static void main(String[] args) 
	{
		Squareconstructor s1=new Squareconstructor(2);
       Squareconstructor s2=new Squareconstructor(4);
        s1.Area();
        s2.Area();

	}
}
