class pratice 
{
	static int a;
	static int b;
	int c;
	int d;
	public pratice(int a,int b)
	{
		pratice.a=a;
		this.b=b;
		this.c=a;
		this.d=b;
	}

	public static void main(String[] args) 
	{
		pratice ob1=new pratice(100,200);
		System.out.println(pratice.a);
		System.out.println(ob1.a); 
		System.out.println(ob1.b);
		System.out.println(ob1.c);
		System.out.println(ob1.d);



		System.out.println("Hello World!");
	}
}
