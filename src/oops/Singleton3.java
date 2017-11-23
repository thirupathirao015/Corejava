package oops;
class Child
{
	public static Child obj;//=new Child();
	private Child()
	      {
		      System.out.println("singleton class is exicuted");
	      }
	public static synchronized Child getInstance()
	 {
		if(obj==null){
			
			obj=new Child();
		}
		return obj;
	 }
}





public class Singleton3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(new Runnable(){
			
			public void run(){
				Child obj=Child.getInstance();
			}
			
		});
Thread t1=new Thread(new Runnable(){
			
			public void run(){
				Child obj=Child.getInstance();
			}
			
		});
t.start();
t1.start();


	}

}
