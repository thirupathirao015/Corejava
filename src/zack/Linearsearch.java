package zack;

public class Linearsearch {
	
      int empid;
      String ename;
      
	public static void main(String[] args)
	{
		Linearsearch ll=new Linearsearch(10,"thirupathi");
		Linearsearch ll1=new Linearsearch(10,"thirupathi");
		
	ll.dispplay();
	ll1.dispplay();
	System.out.println(ll1.hashCode());
	System.out.println(ll.hashCode());
	
    }
	Linearsearch(int empid,String ename){
		 this.empid=empid;
		 this.ename=ename;
	 }
  	void dispplay(){
  		System.out.println(empid+" "+ename);
  	}
}
