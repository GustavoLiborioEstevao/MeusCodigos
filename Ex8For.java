import java.util.Scanner;

public class Ex8For {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double soma = 0;

		System.out.println("Qual é o nome do aluno? ");
		String nome = input.next();

		System.out.println("Qual é a nota da primeira prova?");
		double prova1 = input.nextDouble();
		System.out.println("Qual é a nota da segunda prova?");
		double prova2 = input.nextDouble();

		soma = prova1 + prova2;
		double media = soma / 2;

		System.out.println("A média do(a) " + nome + " é: " + media);

		while (!nome.equals("fim")) {
			System.out.println("Qual é o nome do aluno? ");
			nome = input.next();
			if (nome.equals("fim")) {
				break;
			}
			System.out.println("Qual é a nota da primeira prova?");
			prova1 = input.nextDouble();
			System.out.println("Qual é a nota da segunda prova?");
			prova2 = input.nextDouble();

			soma = prova1 + prova2;
			media = soma / 2;
			System.out.println("A média do(a) " + nome + " é: " + media);

		}
		System.out.println("O programa chegou ao fim");

	}

}
