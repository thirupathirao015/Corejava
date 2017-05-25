package sorting;

public class selectionsort {

	public static void main(String[] args) {
		int t;
		 int array[]={5,4,2,3,1};
		 int n=array.length;
		 for(int i=0;i<n;i++)
		 {
			 for(int j=i;j<n;j++)
			 {
				 if(array[i]>array[j])
				 {
					t=array[i];
					array[i]=array[j];
					array[j]=t;	
				 
				}
			 }
		 }
		 for(int i=0;i<n;i++)
		 {
			 System.out.println("sorting of elements:"+array[i]);
		 
	}

	}
}
