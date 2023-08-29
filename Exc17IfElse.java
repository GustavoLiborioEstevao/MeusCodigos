import java.util.Scanner;

public class Exc17IfElse {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Quantas horas foram trabalhadas?");
		double horasTrabalhadas = input.nextDouble();
		if (horasTrabalhadas < 730 && horasTrabalhadas > 0) {
			System.out.println("Qual seu salario por hora?");
			double salarioHora = input.nextDouble();
			if (horasTrabalhadas > 160) {
				double horaExtra = horasTrabalhadas - 160;
				double salarioExtra = horaExtra * (salarioHora * 1.5);
				System.out.println("Salario: " + ((salarioHora * 160) + salarioExtra));
			} else {
				System.out.println("Salario: " + salarioHora * 160);
			}
		} else {
			System.out.println("As horas que você colocou são inválidas");
		}
		
	}

}