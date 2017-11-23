package oops;

class Ab
{
	
    public static Ab obj=new Ab();//instance is created.
	
    private Ab()//private constructor
	{
		System.out.println("this is the singleton class");
	}
	public static Ab getInstance()//static method.
	{
		
		return obj;
		
	}
}
public class Singleton2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ab a=Ab.getInstance();
		Ab a1=Ab.getInstance();

	}

}
