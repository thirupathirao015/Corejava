package pack;

public class Primenumbers {

	public static void main(String[] args) {
	       
	      String  s = "";
	      for (int i = 1; i <=100; i++)  	   
	      { 	
	    	  
	    	  
	    	  	int count=0;  
	         	//for(int j =i; j>=1; j--)
	    	  	for(int j=1;j<=i;j++)
	         	{
	         			if(i%j==0)			
	         			{
	         				count = count + 1;
	         			}
	         	}
	         	
	         	if (count ==2)
	         	{
	         
 	         			s = s + i + " " ;
	         	}	
	      }	
	      System.out.println("Prime numbers from 1 to n are :"+s); 
	}

}
