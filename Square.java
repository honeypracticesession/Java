class Square 
{

    public int side;
   public void Area()
{
  int A=side*side;
    System.out.println("Area of the square is :"+A);
}

 
	public static void main(String[] args) 
	{
		Square c1=new Square();
      Square c2=new Square();
       c1.side=1;/*initialization of non -static variables directly which is very lengthy*/
        c2.side=2;
         c1.Area();
          c2.Area();
	}
}
