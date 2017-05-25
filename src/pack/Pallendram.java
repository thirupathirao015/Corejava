package pack;

public class Pallendram {

	public static void main(String[] args) {
		 
		  int rem,sum=0,n=120,n1;
		  n1=n;
		  	while(n>0)
		  	{ 
		   		rem=n%10;
		  		sum=(sum*10)+rem;  
		 	 	n=n/10;
			}
		        if(n1==sum)
			{

		        System.out.println("pallenram");
			}
		     else
		     {
		    	 System.out.println("Not Pallenram"); 	

			 }
	


	}

}
