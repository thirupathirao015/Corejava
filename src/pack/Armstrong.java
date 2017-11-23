package pack;

public class Armstrong {
	//Sum of the individual cub's

	public static void main(String[] args) {
		
		 int rem,sum=0,n=153,n1;
		  n1=n;
		  	while(n>0)
		  	{ 
		   		rem=n%10;
		  		sum=sum+(rem*rem*rem);  
		 	 	n=n/10;
			}
		        if(n1==sum)
			{

		        System.out.println("Armstrong"  +sum);
			}
		     else
		     {
		    	 System.out.println("Not Armstrong"  +sum); 	

			 }


	}

}
