import java.util.Scanner;

public class Exc2IfElse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Escreva o primeiro número: ");
		int numeroUm = input.nextInt();

		System.out.println("Qual é o segundo número: ");
		int numeroDois = input.nextInt();

		if (numeroUm % numeroDois == 0) {
			System.out.println("Eles são múltiplos");
		} else {
			System.out.println("Eles não são múltiplos");
		}
	}

}
