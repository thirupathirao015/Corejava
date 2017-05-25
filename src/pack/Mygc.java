package pack;

public class Mygc {
int x;

	public Mygc(int x)
	{
		//super();
		this.x = x;
     }
public void Display()
{
	System.out.println(x);
}
public void finalize(){System.out.println("object is garbage collected");}  

public static void main(String[] args) {

	Mygc m1= new Mygc(10);
	Mygc m5= new Mygc(10);
	
	Mygc m6= new Mygc(20);
	m5=m6;
	//mygc m8= new mygc();
	//m3=null;
//	m8=null;
	
	System.out.println(m5.x);
	System.out.println(m6.x);
	//m5.disp();
//m6.disp();
	m5=null;
	m1=null;
System.gc();
	System.out.println("Object m6:"+" "+m6.x);
	System.out.println(m5.x);
	
}
}
