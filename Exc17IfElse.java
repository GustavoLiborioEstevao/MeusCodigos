import java.util.Scanner;

public class Exc17IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas horas voc� trabalhou?");
		double horas = input.nextDouble();
		
		System.out.println("Quanto voc� ganha por hora?");
		double ganhoPorHora = input.nextDouble();
		
		double salarioSemAcrescimo = horas * ganhoPorHora; 
		
		double horaExtra = horas - 40;
		
		if (horas > 40) {
			System.out.println("Seu sal�rio ser�: " + ganhoPorHora * 0.5 * horaExtra  + salarioSemAcrescimo);
		}
		else {
			System.out.println("Seu sal�rio ser� " +salarioSemAcrescimo);
		}
	}

}
