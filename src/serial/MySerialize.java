package serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerialize {

	public static void main(String[] args) {
		try
		{
		Customer emp1 =new Customer(102,"Ram Kumar","Bangalore");
		//FileWriter fw =new FileWriter("E:\\java\\File\\t7.txt");
//	A a=new A();
		
        FileOutputStream fout =new FileOutputStream("E:\\rtr");
		ObjectOutputStream opt =new ObjectOutputStream(fout);
		opt.writeObject(emp1);
		//opt.writeObject(a);
		opt.flush();  
		opt.close();
		System.out.println("Success");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
