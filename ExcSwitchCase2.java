import java.util.Scanner;

/**
 * @author glestevao
 *
 */
public class ExcSwitchCase2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Write the name of a fruit: ");
		String fruit = input.next();

		switch (fruit) {
		case "Banana":
			System.out.println("I like this fruit");
			break;
		case "Pear":
			System.out.println("I don't like this fruit");
			break;
		case "Grape":
			System.out.println("I like this fruit");
			break;
		case "Apple":
			System.out.println("I like this fruit");
			break;
		case "Kiwi":
			System.out.println("I don't like this fruit");
			break;
		default:
			System.out.println("I don't know this fruit");

		}
	}
}
