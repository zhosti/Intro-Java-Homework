import java.util.Scanner; 

public class SumTwoNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int firstNumber = input.nextInt();
		
		System.out.println("Enter second number:");
		int secondNumber = input.nextInt();
		
		int result = firstNumber + secondNumber;
		System.out.println("Sum of numbers: " + result);

	}

}
