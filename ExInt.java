import java.util.Scanner;

public class ExInt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor inteiro: ");
		int valorUm = input.nextInt();
		System.out.println("Digite o segundo valor inteiro: ");
		int valorDois = input.nextInt();
		
		int soma = valorUm + valorDois;
		int multiplicacao = valorUm * valorDois;
		
		System.out.println("A soma dos números que você digitou resulta em: " + soma + " e a multiplicação: " + multiplicacao);
	}

}
