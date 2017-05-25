package sorting;

public class Bubblesort {

	public static void main(String[] args) {
		int t;
		int array[]={5,4,3,2,1};
		int n=array.length;
		for(int i=0; i < n; i++)
		  {
              for(int j=1; j < (n-i); j++)
              {
                     
                      if(array[j-1] > array[j])
                      {
                              //swap the elements!
                              t = array[j-1];
                              array[j-1] = array[j];
                              array[j] = t;
                      }
              }
		  }
		 for(int i=0;i<n;i++)
		 {
			 System.out.println("sorting of elements:"+array[i]);
		 }
	}

}
