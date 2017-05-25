package string;

public class Stringbuffer {

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("thiru") ;
		sb.append("thiru");
		System.out.println(sb);
		sb.insert(5,"good boy ");
		System.out.println(sb);
		
		 sb.reverse();
		 System.out.println(sb);
		
		System.out.println(sb.capacity());
	}

}
