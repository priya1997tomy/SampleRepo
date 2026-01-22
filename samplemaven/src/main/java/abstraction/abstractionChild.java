package abstraction;

public class abstractionChild extends abstractionParent {

	public static void main(String[] args) {
		abstractionChild obj = new abstractionChild();
		obj.sum();
		obj.display();

	}

	@Override
	public void sum() {
		
		int a = 10;
		int b = 4;
		int c = a+b;
		System.out.println(c);
		
	}

}
