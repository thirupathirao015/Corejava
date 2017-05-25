package serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyDeSerialization {

	public static void main(String[] args) {
		FileInputStream fin;
		try {
			fin = new FileInputStream("E:\\rtr");
		
	    ObjectInputStream bin = new ObjectInputStream(fin);
	  //  A a=(A) bin.readObject();
	    Customer emp2= (Customer) bin.readObject();
	    //MyFout my1=(MyFout)bin.readObject();
	    
	 // int x=a.Add(25);
	 // int y=a.mul(50);
	 // System.out.println(x);
	 // System.out.println(y);
	    System.out.println(emp2);
	    bin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
