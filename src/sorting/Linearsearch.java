package sorting;
 
public class Linearsearch {

	public static void main(String[] args) {
        
        int arr[] = {0,2879, 15, 29, 78, 26, 24, 44, 167, 13,24,47};
        int i;   
        int s = 24;
        boolean flag=false;
       
        for( i=0; i<arr.length; i++)
        {
               if(arr[i]==s)
               {
                     flag=true;
                     break;
               }
              
        }
       
                    if(flag)
                    {
                          System.out.println(s + " index  position "+i);
                    }
                   else
                   {
                          System.out.println(s + " no not found");
                   }
	}

}
