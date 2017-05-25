package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bigestnumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size");
		int n=sc.nextInt();
		//BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		 System.out.println("Enter numbers");*/
		int arr[]={1,4,5,3,6,2,8};
		/*for(int i=0;i<arr.length;i++)
		{
			
		        arr[i] = sc.nextInt();
		}*/
		int max=arr[0];
		int secmax=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(secmax<arr[i]&&max>arr[i])
			{
				secmax=arr[i];
			}
		}
		   System.out.println("The maximum number is:"+secmax);
			System.out.println("The maximum number is:"+max);
	}

}





//int arr[]={1,4,5,3,6,2,8};

/*int arr[]=new int[7];
     arr[0]=1;
     arr[1]=4;
     arr[2]=5;
     arr[3]=3;
     arr[4]=6;
     arr[5]=2;
     arr[6]=8;*/
