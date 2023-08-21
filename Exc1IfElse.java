import java.util.Scanner;

public class Exc1IfElse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva algum número: ");
		int numeroUm = input.nextInt();
		
		System.out.println("Escreva outro número: ");
		int numeroDois = input.nextInt();
		
		if (numeroUm > numeroDois) {
			System.out.println("O maior número é: " + numeroUm);
		} else {
			System.out.println("O maior número é: " + numeroDois);;
		}

	}

}
