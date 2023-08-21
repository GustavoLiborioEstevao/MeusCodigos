import java.text.DecimalFormat;
import java.util.Scanner;

public class Exfloat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Qual foi a nota na primeira prova? ");
		double notaUm = input.nextDouble();
		System.out.println("Qual foi a nota na segunda prova? ");
		double notaDois = input.nextDouble();
		
		double notaUmPeso = notaUm * 3.5;
		double notaDoisPeso = notaDois * 6.5;
		double mediaPonderada = (notaUmPeso + notaDoisPeso) / 10;
		
		System.out.println("A sua média ponderada é: " + df.format(mediaPonderada));
	}

}
