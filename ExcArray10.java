import java.text.DecimalFormat;
import java.util.Scanner;

public class ExcArray10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		double media = 0;
		double soma = 0;

		double vetor[] = new double[12];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Escreva o valor que ficar� na posi��o " + i + ":");
			vetor[i] = input.nextDouble();

			 
			soma = vetor[i] + soma;
			}
			
			media = soma / 12;
			
			for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > media) {
				System.out.println(vetor[i]);
			}
		}
			System.out.println("A m�dia �: " + df.format(media));
	}
}
