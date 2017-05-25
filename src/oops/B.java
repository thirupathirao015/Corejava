package oops;

public class B  extends A
{
	int y;
	//mul is one of the method and return type is Integer
	int mul(int x)
	{
		//here x=10 value assign to y,so y value allso 10.
		y=Add(x);
		y=y*x;
		return y;
	}
	
	public static void main(String[] args) {
		
		B b= new B();
		//here x=10;
        int n= b.mul(10);
        System.out.println(n);
	}


	}


