package pack;

import java.io.Serializable;

public class Serializa implements  Serializable
 {
	int sum,y=5;
	int x=2;
	public int Add(int x)
	{
		sum=sum+x;
		return sum;
	}
	public int mul(int x)
	{
		y=y*x;
		return y;
	}
	public static void main(String[] args) {
		 
	}

}
