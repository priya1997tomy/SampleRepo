package inheritance;

public class HeirarchialChild1 extends HeirarchialParent {

	public static void main(String[] args) {
		HeirarchialChild1 obj = new HeirarchialChild1();
		obj.display1();
	}
	public void display1()
	{
		System.out.println("Child1");
	}

}
