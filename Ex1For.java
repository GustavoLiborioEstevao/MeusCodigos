import java.util.Scanner;

public class Ex1For {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i <= 5; i++) {
			System.out.println("Insira o número");
			int numero = input.nextInt();
			
			if (numero % 2 == 0) {
				System.out.println("Número par");
			} else {
				System.out.println("Número ímpar");
			}
		}
		
		
	}

}
