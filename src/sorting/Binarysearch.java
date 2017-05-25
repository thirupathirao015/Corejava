package sorting;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		
		int  first, last, middle;
		int p=8;
		int array1[]={2,1,3,5,4,7,9,6,8,10};
		int n=array1.length;
	      first = 0;
	      last = n - 1;
	      middle = (first + last)/2;
	     
	      while( first <= last )
	      {
	         if ( array1[middle] < p )
	         {
	           first = middle + 1;
	         }
	         else if ( array1[middle] == p )
	         {
	           System.out.println(p + " found at location " + (middle + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	             middle = (first + last)/2;
	      }
	              if ( first > last )
	              {
	                    System.out.println(p + " is not found.\n");
	              }
	   }

	}


