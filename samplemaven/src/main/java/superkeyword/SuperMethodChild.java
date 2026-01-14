package superkeyword;

public class SuperMethodChild extends SuperMethodParent{

	public void display()
	{
		System.out.println("Child");
		super.display();
	}
	
	public static void main(String[] args) {
		
		SuperMethodChild obj = new SuperMethodChild ();
		obj.display();
	}

}
