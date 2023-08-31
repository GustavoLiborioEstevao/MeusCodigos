import java.util.Scanner;

/**
 * @author glestevao
 *
 */
public class ExcArray2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double media = 0;
		double soma = 0;
		double maior = Integer.MIN_VALUE;
		double menor = Integer.MAX_VALUE;
		int elements[] = new int[5];

		for (int i = 0; i < elements.length; i++) {
			System.out.println("Insira o elemento: ");
			int num = input.nextInt();
			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}
			soma = num + soma;
		}
		media = soma / 5;
		System.out.println(
				"O maior número é: " + maior + "\nO menor número é: " + menor + "\nA média dos números é: " + media);
	}

}
