import java.util.Scanner;

public class Exc16IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Qual � seu sal�rio? ");
		double salario = input.nextDouble();

		System.out.println("Digite a quantidade de meses que voc� foi admitido: ");
		int meses = input.nextInt();

		double salario5porcento = salario + salario * 0.05;
		double salario7porcento = salario + salario * 0.07;

		if (meses < 12) {
			System.out.println("Seu novo sal�rio �: " + salario5porcento);
		}
		if (meses >= 13 && meses <= 48) {
			System.out.println("Seu novo sal�rio �: " + salario7porcento);
		}

	}

}
