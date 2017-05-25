package array;

import java.util.Scanner;

public class Arraydupl {

	public static void main(String[] args) {
		int i, j, k, n;
 	   Scanner sc =new Scanner(System.in);
 	      
 	         System.out.println ("\nEnter array size : ");
 	      n= sc.nextInt();
 	   int arr[] =new int[n];

 	         System.out.println ("\nEnter "+ n+" array elements one by one" );
 	      for(i = 0; i < n; i++) 
 	      {
 	         arr[i]= sc.nextInt();

 	      }
 	      
 	         System.out.println ("\nOriginal array is : ");
 	      for(i=0;i< n;i++)
 	      {
 	         System.out.println (arr[i]);
 	      }

 	      System.out.println("\nNew array is  : ");
 	      for(i=0; i < n; i++) 
 	      {
 	         for(j=i+1; j < n; )
 	         {
 	            if(arr[j] == arr[i])
 	            {
 	               for(k=j; k < n;k++) 
 	               {
 	            	   if(k+1 < n)
 	            	   {
 	                  arr[k] = arr[k+1];
 	            	   }
 	            	 
 	               }
 	               n--;
 	            }
 	            else {
 	               j++;
 	            }
 	         }
 	      }

 	      for(i=0; i < n; i++)
 	      {
 	               System.out.println (arr[i]);
 	      }
 	   }
	}


