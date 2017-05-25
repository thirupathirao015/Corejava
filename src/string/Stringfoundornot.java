package string;

public class Stringfoundornot {

	public static void main(String[] args) {
		 String s[]={"thiru","gopi","sai","bhavani"};
		 int n=s.length;
		 int count=0;
		 String s1="bhavani";
		 for(int i=0;i<n;i++)
		 {
			 if(s[i].equals(s1))
			 {
				 count++;
				 break;
				 
		      }
		 }
		 if(count==1)
		 {
			 System.out.println("Given String is Found");
		 }else{
			 System.out.println("Given String is not Found");
		 }
	}

}
