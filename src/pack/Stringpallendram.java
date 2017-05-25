package pack;

public class Stringpallendram
{

	public static void main(String[] args) {
	   
		String str ="madan";
        int n = str.length();
        String  rev = "";
        
        for(int i=n-1 ; i>=0 ; i--)
        {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
            System.out.println("Given string is a palindrome:"+rev);
        else
            System.out.println("Given string is not a palindrome:"+rev);
    }
	
}

