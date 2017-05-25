package array;

public class Dup {

	public static void main(String[] args) {
		 int array[]={1,2,1,2,3};
		 int n=array.length;
		 for(int i=0;i<n;i++)
		 {
			 for(int j=i+1;j<n;)
			 {
				 			if(array[i]==array[j])
				 			{
				 					for(int k=j;k<n;k++)
				 					{
				 							if(k+1<n)
				 							{
				 								array[k]=array[k+1] ;
				 							}
				 					}n--;
				 			}else{j++;}
			 }
		 }
		 for(int i=0;i<n;i++)
		 {
			 System.out.println("values Are:"+array[i]);
		 }
	}

}
