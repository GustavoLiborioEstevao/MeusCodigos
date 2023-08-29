import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	
		System.out.println("Entre com o valor de A:");
		double a = input.nextDouble();

		System.out.println("Entre com o valor de B:");
		double b = input.nextDouble();

		System.out.println("Entre com o valor de C:");
		double c = input.nextDouble();

		double soma = -(b) / a;
		double produto = c / a;
		outerLoop:
		for (double numero1 = -10000; numero1 <= 10000; numero1++) {

			for (double numero2 = -10000; numero2 <= 10000; numero2++) {

				if (numero1 + numero2 == soma && numero1 * numero2 == produto) {
					System.out.println("Os valores são " + numero1 + " e " + numero2);
					break outerLoop;
				}
			}
		}
	}
}
