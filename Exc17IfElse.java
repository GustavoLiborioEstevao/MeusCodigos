import java.util.Scanner;

public class Exc17IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas horas você trabalhou?");
		double horas = input.nextDouble();
		
		System.out.println("Quanto você ganha por hora?");
		double ganhoPorHora = input.nextDouble();
		
		double salarioSemAcrescimo = horas * ganhoPorHora; 
		
		double horaExtra = horas - 40;
		
		if (horas > 40) {
			System.out.println("Seu salário será: " + ganhoPorHora * 0.5 * horaExtra  + salarioSemAcrescimo);
		}
		else {
			System.out.println("Seu salário será " +salarioSemAcrescimo);
		}
	}

}
