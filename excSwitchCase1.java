import java.util.Scanner;

/**
 * @author glestevao
 *
 */
public class excSwitchCase1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Type a number: ");
		double num1 = input.nextDouble();

		System.out.println("Type another number: ");
		double num2 = input.nextDouble();

		System.out.println("Type a number of an operation, the options are:\n1 = sum\n2= subtraction\n3= multiplication\n4= division");
		int numOperation = input.nextInt();

		switch (numOperation) {
		case 1:
			System.out.println("The result is: " + (num1 + num2));
			break;
		case 2:
			System.out.println("The result is: " + (num1 - num2));
			break;
		case 3:
			System.out.println("The result is: " + (num1 * num2));
			break;
		case 4:
			System.out.println("The result is: " + (num1 / num2));
			break;
		}
	}
}
