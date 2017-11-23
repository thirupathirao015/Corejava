package string;

public class Stringsorting {

	public static void main(String[] args) {
		
		 String s[]={"thiru","gopi","sai","bhavani"};
		// int n=s.length;
		 for(int j=0; j<s.length;j++)
		 {
		     for (int i=j+1 ; i<s.length; i++)
		     {
		         if(s[i].compareTo(s[j])<0)
		         {
		             String temp= s[j];
		             s[j]=s[i]; 
		             s[i]=temp;


		         }
		     }
             System.out.println(s[j]);
		 
	}

}
}

