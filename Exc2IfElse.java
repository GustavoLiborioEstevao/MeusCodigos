import java.util.Scanner;

public class Exc2IfElse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Escreva o primeiro n�mero: ");
		int numeroUm = input.nextInt();

		System.out.println("Qual � o segundo n�mero: ");
		int numeroDois = input.nextInt();

		if (numeroUm % numeroDois == 0) {
			System.out.println("Eles s�o m�ltiplos");
		} else {
			System.out.println("Eles n�o s�o m�ltiplos");
		}
	}

}
