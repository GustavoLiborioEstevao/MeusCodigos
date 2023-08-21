import java.text.DecimalFormat;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Exc8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Qual � o valor de A? ");
		double valorA = input.nextDouble();
		
		System.out.println("Qual � o valor de B? ");
		double valorB = input.nextDouble();
		
		System.out.println("Qual � o valor de C? ");
		double valorC = input.nextDouble();
		
		double areaTrianguloRetangulo = (valorA * valorC) / 2;
		double areaCirculo = (valorC * valorC) * Math.PI;
		double areaTrapezio = ((valorA + valorB) * valorC) / 2;
		double areaQuadrado = valorB * valorB;
		double areaRetangulo = valorA * valorB;
		
		System.out.println("O valor da �rea do tri�ngulo ret�ngulo �: " + df.format(areaTrianguloRetangulo));
		System.out.println("O valor da �ea do c�rculo �: " + df.format(areaCirculo));
		System.out.println("O valor da �rea do trap�zio �: " + df.format(areaTrapezio));
		System.out.println("O valor da �rea do quadrado �: " + df.format(areaQuadrado));
		System.out.println("O valor da �rea do ret�ngulo �: " + df.format(areaRetangulo));
		
		
		
	}

}
