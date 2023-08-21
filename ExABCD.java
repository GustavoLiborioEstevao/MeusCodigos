import java.util.Scanner;

public class ExABCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva o valor A: ");
		int valorA = input.nextInt();
		System.out.println("Escreva o valor B: ");
		int valorB = input.nextInt();
		System.out.println("Escreva o valor C: ");
		int valorC = input.nextInt();
		System.out.println("Escreva o valor D: ");
		int valorD = input.nextInt();

		int produtoAB = valorA * valorB;
		int produtoCD = valorC * valorD;
		int diferenca = produtoAB - produtoCD;
		
		System.out.println("A diferença entre o produto de A e B pelo produto de C e D é: " + diferenca);
		
	}

}
