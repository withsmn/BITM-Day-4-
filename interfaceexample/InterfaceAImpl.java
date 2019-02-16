package interfaceexample;

public class InterfaceAImpl implements InterfaceA, InterfaceB{
	public final String batch = "MAD 3";
	
	@Override
	public void doSomething() {
		System.out.println("doing something...");
		
	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		
	}
	
}
