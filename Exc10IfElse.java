import java.util.Scanner;

public class Exc10IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha algum número");
		int nmrUm = input.nextInt();
		
		System.out.println("Escreva outro número");
		int nmrDois = input.nextInt();
		
		System.out.println("Escolha a operação que você quer fazer entre esses números\n1: some os dois números.\r\n"
				+ "Caso seja 2: subtraia os dois números.\r\n"
				+ "Caso seja 3: multiplique os dois números.\r\n"
				+ "Caso seja 4: divida os dois números");
		int operacao = input.nextInt();
		
		if (operacao == 1) {
			System.out.println(nmrUm + nmrDois);
		}
		if (operacao == 2) {
			System.out.println(nmrUm - nmrDois);
		}
		if (operacao == 3) {
			System.out.println(nmrUm * nmrDois);
		}
		if (operacao == 4) {
			System.out.println(nmrUm / nmrDois);
		}
		
	}

}
