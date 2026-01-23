package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		
		int age =16;
		if(age>18)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new ArithmeticException("Not eligible age under 18!!!");
		}
	}

}
