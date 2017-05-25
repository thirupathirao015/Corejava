package oops;

class Base
{
//public	int sum,x=10;
	
public	void fun()
	{
	System.out.println("hi");
		/*sum=sum+x;
		return sum;
*/	}
}
public class Overriding extends Base
{
     
	//public	int mul=10,x=20;
	public	void fun()
	{
		System.out.println("hello");
		/*//int y=super.fun(x);
		mul=mul*x;
		return mul;*/
	}
	
	public static void main(String[] args) {
		Overriding m =new Overriding();
		//int a=m.fun(10);
		m.fun();
	   
		System.out.println("thiru");
	
		
	}

 

}
