package pack;

public class Smallestnumber {

	public static void main(String[] args) {
		 int arr[]={1,2,4,3,6,5,7,8};
		 int n=arr.length;
		 int min=arr[0];
		 for(int i=0;i<n;i++)
		 {
			 if(min>arr[i])
			 {
				 min=arr[i];
			 }
		 }
		 System.out.println("The minimum number is:"+min);
		 int max=arr[0];
		 for(int i=0;i<n;i++)
		 {
			 if(max<arr[i])
			 {
				 max=arr[i];
			 }
		 }
		 System.out.println("The maximum number is:"+max);
	}

}
