import java.util.Scanner;

public class Exc10IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha algum n�mero");
		int nmrUm = input.nextInt();
		
		System.out.println("Escreva outro n�mero");
		int nmrDois = input.nextInt();
		
		System.out.println("Escolha a opera��o que voc� quer fazer entre esses n�meros\n1: some os dois n�meros.\r\n"
				+ "Caso seja 2: subtraia os dois n�meros.\r\n"
				+ "Caso seja 3: multiplique os dois n�meros.\r\n"
				+ "Caso seja 4: divida os dois n�meros");
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
