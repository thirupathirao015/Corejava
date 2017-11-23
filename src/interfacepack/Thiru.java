package interfacepack;

public interface Thiru {
	
	public void m1(int i);
	public void m2(float f);
	public void m3(String s);
	public void m4(char c);
	
	public default void m5(){
		System.out.println("interface method called");
		
	}

}
