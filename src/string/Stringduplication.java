package string;

import java.util.HashMap;
import java.util.Map;

public class Stringduplication {

	public static void main(String[] args) {
		int count=0;
		 String s="thiru,gopi,gopi,thiru,bhavani";
		 String s1[]=s.split(",");
		 Map<String,Integer> m = new HashMap();
		 for(int i=0;i<s1.length;i++)
		 {
			 for(int j=0;j<s1.length;j++)
			 {
				 if(s1[i].equals(s1[j]))
				 {
					  count++;
					  break;
				 }
				 m.put(s1[i],count);
				 
			 }
			 System.out.println("Duplication of values are:"+m);
			
		 }

	}

}
