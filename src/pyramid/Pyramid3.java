package pyramid;

public class Pyramid3 {

	public static void main(String[] args) {
		
		String s[]={"j","a","v","a"};
		int n=s.length;
		
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n-i; j++)
			{
				System.out.print(" "); 
			} 
			for (int k = 0; k <= i; k++) 
			{ 
				System.out.print(s[k]+" "); 
			} 
			System.out.println();
		}

  }

}
