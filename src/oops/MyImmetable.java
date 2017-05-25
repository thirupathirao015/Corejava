package oops;

public final class MyImmetable {
	
	 private int id;
	 private String name;
	 
	 
		public MyImmetable(int id, String name) 
		{
		      //super();
		       this.id = id;
		       this.name = name;
	    }
		
	void disp()
	   {
		   System.out.println(id+" "+name);
	   }
		public static void main(String[] args) {
			
		final	MyImmetable m=new MyImmetable(10,"Ram");
		//m=new MyImmetable(11,"Ram1");
			m.disp();
			

	}

}
