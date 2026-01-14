package polymorphism;

public class Child extends Parent{
	public void display(int a , int b)
	{
		
		int c = a-b;
		System.out.println(c);
		super.display(200, 300);
		
	}

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.display(300, 150);
	}

}
