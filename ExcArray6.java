import java.util.Scanner;

/**
 * @author glestevao
 *
 */
public class ExcArray6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Escolha alguma posi��o para colocar algum n�mero de sua escolha: ");
		int posicao = input.nextInt();
		System.out.println("Escolha algum n�mero para ser substitu�do na posi��o: ");
		int num = input.nextInt();

		int vetor[] = new int[5];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = 2 + i;
		}
		vetor[posicao] = num;
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}
