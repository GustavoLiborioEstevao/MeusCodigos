import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Qual foi o valor em dólares que você entregou à casa de câmbio? ");
		double dolares = input.nextDouble();
		
		double reais = dolares * 4.98;
		
		System.out.println("O valor que a casa de câmbio deve para você é: " + df.format(reais));
		
	}

}
