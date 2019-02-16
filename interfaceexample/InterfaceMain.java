package interfaceexample;

public class InterfaceMain {

	public static void main(String[] args) {
		InterfaceAImpl iai = new InterfaceAImpl();
		iai.doSomething();
		
		InterfaceA ia = new InterfaceAImpl();
		ia.doSomething();
		

		InterfaceA ia2 = new InterfaceAImpl2();
		ia2.doSomething();
		
		
	}

}
