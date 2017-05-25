package pack;

public class Prime {

	public static void main(String[] args) {
       int n=4;
       int count=0;
       for(int i=1;i<=n;i++)
       {
    	   		if(n%i==0)
    	   		{
    	   			count=count+1;  
    	   		}
       }
       
           if(count==2)
           {
        	   System.out.println("Given number is prime:count" +count);
           }else{
        	   System.out.println("Given number is not prime:count" +count);
           }
       
	}

}
