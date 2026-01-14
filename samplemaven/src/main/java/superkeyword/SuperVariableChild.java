package superkeyword;

public class SuperVariableChild extends SuperVariableParent {
int a = 20;
public void print()
{
	System.out.println(a);
	System.out.println(super.a);
}



	public static void main(String[] args) {
		SuperVariableChild obj1 = new SuperVariableChild();
		obj1.print();

	}

}
