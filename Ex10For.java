import java.util.Scanner;

public class Ex10For {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int contador18 = 0;
		int contador20 = 0;
		String nome18 = "";
		System.out.println("Quantos alunos tem na sala?");
		int qtdAlunos = input.nextInt();
		
		for (int i = 1; i <= qtdAlunos; i++) {

			System.out.println("Qual � o nome do " + i + "� aluno?");
			String nome = input.next();
			System.out.println("Qual � a idade do " + i + "� aluno?");
			int idade = input.nextInt();

			if (idade == 18) {
				contador18++;
				nome18 = nome18 + nome + ", ";
			}
			if (idade > 20) {
				contador20++;
			}
		}
		System.out.println("O(s) aluno(s) com 18 anos �/s�o: " + nome18);
		System.out.println(contador20 + " aluno(s) tem mais de 20 anos.");
	}
}
