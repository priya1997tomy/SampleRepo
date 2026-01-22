package interfaceexample;

public class InterfaceChild implements Interface1{
	
	public void show()
	{
		System.out.println("Bye Interface");
	}

	public static void main(String[] args) {
		
		/*InterfaceChild obj = new InterfaceChild();
		obj.display();
		obj.print();
		obj.show();*/
		Interface1 obj1 = new InterfaceChild();
		obj1.display();
		obj1.print();	

	}

	@Override
	public void display() {
		System.out.println("Hello");
		
	}

	@Override
	public void print() {
		System.out.println("Hai Interface");
		
		
	}

}
