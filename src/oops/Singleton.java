package oops;

class Abc
{
	static Abc obj;// =new Abc();
	
	private Abc()
	{
		 
		 System.out.println("demoMethod for singleton");

	
	}
	
	public static  Abc getObject(){
		
		if(obj==null){
		obj=new Abc();
		}
		 return obj;
		
	}
}

public class Singleton {  
public static void main(String args[]){
	 
	Abc obj=Abc.getObject();
	Abc obj1=Abc.getObject();
		
	}

}
