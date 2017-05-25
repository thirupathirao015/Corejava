package oops;

public class MyVarags
{
	static void display(int i,String... str)
	{  
		System.out.println(i);
	
		for(String s:str)
		{
			System.out.println(s);
		}
	}  

	
	public static void main(String... args) {
		
			 
		for(String s:args)
		{
			System.out.println(s);
		}
		
		display(1,"my","name","is","Rama","thiru");//four arguments  
		   // display(1,"thiru");
	}
}
