import java.util.Scanner;

/**
 * @author glestevao
 *
 */
public class ExcArray6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Escolha alguma posição para colocar algum número de sua escolha: ");
		int posicao = input.nextInt();
		System.out.println("Escolha algum número para ser substituído na posição: ");
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
