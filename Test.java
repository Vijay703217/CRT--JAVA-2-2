class Firstyear 
{
	void branch()
		{
		System.out.println("cse");
		}
		void sub()
		{
			System.out.println("1");
		}
		void bag()
		{
			System.out.println("2");
		}
	}
	class Secondyear
	{
		void sub()
		{
			Firstyear f1=new Firstyear();
			f1.branch();
			f1.bag();
			System.out.println("hi");
		}}
		class Test // main class 
		{
			public static void main(String args[])
			{
				Secondyear s1=new Secondyear();
				s1.sub();
			}
		}

	




