import java.util.Scanner;

public class Exc11IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha algum n�mero");
		double nmr = input.nextDouble();
		
		System.out.println("Escolha a opera��o que ir� ser feita com esse n�mero, as op��es s�o:\n1: soma 10 ao n�mero que voc� escolheu\\n2: subtrai 10 ao n�mero que voc� escolheu\\n3: multiplica por 10 ao n�mero que voc� escolheu\\n4: divide por 10 ao n�mero que voc� escolheu");
		int operacao = input.nextInt();
		
		if (operacao == 1) {
			System.out.println(nmr + 10);
		}
		if (operacao == 2) {
			System.out.println(nmr - 10);
		}
		if (operacao == 3) {
			System.out.println(nmr * 10);
		}
		if (operacao == 4) {
			System.out.println(nmr / 10);
		}
	}

}
