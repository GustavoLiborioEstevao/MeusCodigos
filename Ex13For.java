import java.util.Scanner;

public class Ex13For {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numMaior = 0;
		int numMenor = Integer.MAX_VALUE;
		int contador = 0;

		System.out.println("Insira algum n�mero:");
		String num = input.next();

		while (!num.equals("n")) {
			contador++;

			int numInt = Integer.valueOf(num);

			if (numInt > numMaior) {
				numMaior = numInt;
			}
			if (numInt < numMenor) {
				numMenor = numInt;
			}

			System.out.println("Digite outro n�mero");
			num = input.next();

		}
		if (contador == 0) {
			System.out.println("Entrada inv�lida");
		} else {
			System.out.println("Fim do programa");
			System.out.println("O n�mero maior � " + numMaior + " e o n�mero menor � " + numMenor);
		}

	}
}
