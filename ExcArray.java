import java.util.Scanner;

/**
 * @author glestevao
 *
 */
public class ExcArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Quantas pessoas tem na sua famlia? ");
		int membros = input.nextInt();

		int pessoas[] = new int[membros];

		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("Quantos anos tem o familiar numero " + (i + 1) + "?");
			pessoas[i] = input.nextInt();
		}
		for (int i = pessoas.length - 1; i >= 0; i--) {
			System.out.println("O familiar número " + (i + 1) + " tem " + pessoas[i] + " ano/s");
		}

	}
}
