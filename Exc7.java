import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Qual foi o valor em d�lares que voc� entregou � casa de c�mbio? ");
		double dolares = input.nextDouble();
		
		double reais = dolares * 4.98;
		
		System.out.println("O valor que a casa de c�mbio deve para voc� �: " + df.format(reais));
		
	}

}
