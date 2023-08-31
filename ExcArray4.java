import java.util.Scanner;

/**
 * @author glestevao
 *
 */
public class ExcArray4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int vetor[] = new int[100];

		for (int i = 0; i < 100; i++) {
			vetor[i] = i * i;
			System.out.println("O quadrado do número " + i + " no vetor " + i + " é " + vetor[i]);
		}

	}

}
