import java.util.Scanner;

public class Ex5For {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double somaAltura = 0;
		int pessoas = 1;
		while (pessoas >= 1 && pessoas <= 5) {
			System.out.println("Qual é a altura da " + pessoas + "ª pessoa? ");
			pessoas++;
			double altura = input.nextDouble();
			somaAltura = somaAltura + altura;

		}
		double media = somaAltura / 5;
		System.out.println("A média da altura das pessoas é: " + media);
	}

}
