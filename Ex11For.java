import java.util.Scanner;

public class Ex11For {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Escreva algum número para saber seu fatorial");
		int num = input.nextInt();

		int x = num;

		while (num > 1) {
			x = x * (num - 1);
			num--;
		}
		System.out.println("O fatorial do número é igual a " + x);
	}
}
