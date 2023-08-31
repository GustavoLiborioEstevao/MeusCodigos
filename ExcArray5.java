import java.util.Scanner;

/**
 * @author glestevao
 *
 */
public class ExcArray5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Em qual posição no vetor você quer que o número 0 esteja? ");
		int posicao = input.nextInt();

		int vetor[] = new int[5];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = 1 + i * i;
		}
		vetor[posicao] = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
