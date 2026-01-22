package inheritance;

public class MultipleChild implements MultipleParent1,MultipleParent2{
	
	public void show() {
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		
		MultipleChild obj= new MultipleChild();
		obj.display();
		obj.print();
		obj.show();
	}

	@Override
	public void display() {
		System.out.println("Parent one");
		
		
	}

	@Override
	public void print() {
		System.out.println("Parent two");
		
		
	}

}
