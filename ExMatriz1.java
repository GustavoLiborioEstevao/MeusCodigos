import java.util.Iterator;
import java.util.Scanner;

public class ExMatriz1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double matriz[][] = new double[12][2];

		for (int i = 0; i < matriz.length; i++) {
			matriz[i][0] = i + 1;
			System.out.println("Quanto a loja faturou no mês " + (i + 1) + "?");
			matriz[i][1] = input.nextDouble();

		}
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("No mês " + matriz[i][0] + " a loja teve um lucro de " + matriz[i][1] + ".");
		}
	}

}
