import java.util.Scanner;

public class Ex8For {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double soma = 0;

		System.out.println("Qual � o nome do aluno? ");
		String nome = input.next();

		System.out.println("Qual � a nota da primeira prova?");
		double prova1 = input.nextDouble();
		System.out.println("Qual � a nota da segunda prova?");
		double prova2 = input.nextDouble();

		soma = prova1 + prova2;
		double media = soma / 2;

		System.out.println("A m�dia do(a) " + nome + " �: " + media);

		while (!nome.equals("fim")) {
			System.out.println("Qual � o nome do aluno? ");
			nome = input.next();
			if (nome.equals("fim")) {
				break;
			}
			System.out.println("Qual � a nota da primeira prova?");
			prova1 = input.nextDouble();
			System.out.println("Qual � a nota da segunda prova?");
			prova2 = input.nextDouble();

			soma = prova1 + prova2;
			media = soma / 2;
			System.out.println("A m�dia do(a) " + nome + " �: " + media);

		}
		System.out.println("O programa chegou ao fim");

	}

}
