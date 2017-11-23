package pack;

public class Fibnoccinumber {

	public static void main(String[] args) {
        int first=0,second=1;
        int n=10;
        System.out.println(" " +first);
        int next=0;
        for(int i=1;i<n;i++)
        {
        	first=second;
        	second=next;
            next=first+second;
            System.out.println(" "+next);
        }
       
	}

}
