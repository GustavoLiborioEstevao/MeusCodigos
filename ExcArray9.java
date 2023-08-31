import java.util.Scanner;

/**
 * @author glestevao
 *
 */
public class ExcArray9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double vetor[] = new double[12];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Escolha um número para ocupar a posição " + i + " no vetor: ");
			double num = input.nextDouble();

			vetor[i] = num;

			if (i % 2 == 0) {
				vetor[i] = num + (num * 0.02);
			} else {
				vetor[i] = num + (num * 0.05);
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
