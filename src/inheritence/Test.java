package inheritence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Parent obj= new Parent();
            obj.m1();
          // obj.m2();  //child class method not allowed in this case.
            
         Child obj1=new Child();
         obj1.m1();
         obj1.m2();
         
         //Child obj2=new Parent(); incompatable types.
         
        Parent  obj3=new Child();
         obj3.m1();
        //  obj3.m2(); //child class method not allowed 
            
	}

}
