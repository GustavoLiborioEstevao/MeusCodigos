import java.util.Scanner;

/**
 * @author glestevao
 *
 */
public class ExcArray3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Type any number: ");
		int num = input.nextInt();

		int number[] = new int[5];

		number[0] = 1;
		number[1] = 2;
		number[2] = 3;
		number[3] = 4;
		number[4] = 5;

		for (int i = 0; i < number.length; i++) {
			if (number[i] == num) {
				System.out.println("O número " + num + " existe no vetor " + i);
			}
		}
	}
}
