package oops;
public class Overloading {
	 
	/*public static void main(String str)
	{
		System.out.println(str);
	}
*/	int x; long y;
	void add(int x)
	{
		System.out.println(x);
	}
	void add(long y)
	{
		
		System.out.println(y);
		//System.out.println("hi"+y);
	}
	
	public static void main(String[] args) 
	{
		 		
		System.out.println("Main");
		Overloading m=new Overloading();
		//m.main( "thiru");
		//m.add(6);
		m.add(5);
		//Overloading.main("Hello java");

	}

	}


