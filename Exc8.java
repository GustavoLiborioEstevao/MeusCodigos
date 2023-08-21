import java.text.DecimalFormat;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Exc8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Qual é o valor de A? ");
		double valorA = input.nextDouble();
		
		System.out.println("Qual é o valor de B? ");
		double valorB = input.nextDouble();
		
		System.out.println("Qual é o valor de C? ");
		double valorC = input.nextDouble();
		
		double areaTrianguloRetangulo = (valorA * valorC) / 2;
		double areaCirculo = (valorC * valorC) * Math.PI;
		double areaTrapezio = ((valorA + valorB) * valorC) / 2;
		double areaQuadrado = valorB * valorB;
		double areaRetangulo = valorA * valorB;
		
		System.out.println("O valor da área do triângulo retângulo é: " + df.format(areaTrianguloRetangulo));
		System.out.println("O valor da áea do círculo é: " + df.format(areaCirculo));
		System.out.println("O valor da área do trapézio é: " + df.format(areaTrapezio));
		System.out.println("O valor da área do quadrado é: " + df.format(areaQuadrado));
		System.out.println("O valor da área do retângulo é: " + df.format(areaRetangulo));
		
		
		
	}

}
