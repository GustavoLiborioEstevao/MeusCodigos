import java.util.Scanner;

public class Exc1IfElse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva algum n�mero: ");
		int numeroUm = input.nextInt();
		
		System.out.println("Escreva outro n�mero: ");
		int numeroDois = input.nextInt();
		
		if (numeroUm > numeroDois) {
			System.out.println("O maior n�mero �: " + numeroUm);
		} else {
			System.out.println("O maior n�mero �: " + numeroDois);;
		}

	}

}
