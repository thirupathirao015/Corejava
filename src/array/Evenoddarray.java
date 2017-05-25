package array;

public class Evenoddarray {

	public static void main(String[] args) {
		
		 int array[]={1,2,3,4,5,6,7,8,9,10};
		 int n=array.length;
		 int even[]= new int[n];
		 int odd[]=new int[n];
		 int E=0;
		 int O=0;
		  
		 for(int j=0;j<n;j++)
		 {
			 if(array[j]%2==0)
			 {
				 even[E]=array[j];
				 System.out.println(even[E]);
				 E++;
				 
			 }
		 }
		 for(int i=0;i<n;i++)
		 {
			  if( array[i]%2!=0)
			 {
				odd[O]=array[i];
				System.out.println(odd[O]);
			 }
		 }
	}

	 

}
