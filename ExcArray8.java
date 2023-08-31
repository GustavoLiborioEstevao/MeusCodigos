import java.util.Iterator;
import java.util.Scanner;

/**
 * @author glestevao
 *
 */
public class ExcArray8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double numMaior = Integer.MIN_VALUE;
		double numMenor = Integer.MAX_VALUE;
		int contador = 0;
		double soma = 0;
		double media = 0;
		double vetor[] = new double[100];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Qual n�mero voc� quer colocar na posi��o " + i + "?");
			String num = input.next();

			if (num.equals("n")) {
				break;
			}
			contador++;
			double numDouble = Double.valueOf(num);
			vetor[i] = numDouble;
					
			if (numDouble > numMaior) {
				numMaior = numDouble;
			}
			if (numDouble < numMenor) {
				numMenor = numDouble;
			}

			soma = numDouble + soma;

		}
		media = soma / contador;
		System.out.println("O n�mero maior � " + numMaior + "\nO n�mero menor �: " + numMenor + "\nA m�dia �: " + media);
	}
}