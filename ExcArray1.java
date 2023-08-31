import java.util.Scanner;

/**
 * @author glestevao
 *
 */
public class ExcArray1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int elements[] = new int[5];

		for (int i = 0; i < elements.length; i++) {
			System.out.println("Type the value " + (i + 1) + ": ");
			elements[i] = input.nextInt();
		}
		for (int i = elements.length - 1; i >= 0; i--) {
			System.out.println("The value " + (i + 1) + " is: " + elements[i]);

		}

	}

}
