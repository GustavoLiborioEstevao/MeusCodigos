import java.util.Scanner;

/**
 * @author glestevao
 *
 */
public class ExcArray7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int array[] = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = 2 + i;
			System.out.println(array[i]);
		}
		System.out.println("\nElementos invertidos: \n");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

	}
}
