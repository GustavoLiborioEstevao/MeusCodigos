import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc15IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");

		System.out.println("Qual é a primeira nota?");
		double nota1 = input.nextDouble();

		System.out.println("Qual é a segunda nota?");
		double nota2 = input.nextDouble();

		System.out.println("Qual é a terceira nota?");
		double nota3 = input.nextDouble();

		System.out.println("Qual é a média dos exercícios?");
		double mediaExerc = input.nextDouble();

		double aproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExerc) / 7;

		if (aproveitamento >= 9) {
			System.out.println("Aproveitamento = " + aproveitamento + "\nA\nAprovado");
		}
		if (aproveitamento >= 7.5 && aproveitamento < 9) {
			System.out.println("Aproveitamento = " + aproveitamento + "\nB\nAprovado");
		}
		if (aproveitamento >= 6 && aproveitamento < 7.5) {
			System.out.println("Aproveitamento = " + aproveitamento + "\nC\nAprovado");
		}
		if (aproveitamento >= 4 && aproveitamento < 6) {
			System.out.println("Aproveitamento = " + aproveitamento + "\nD\nReprovado");
		}
		if (aproveitamento < 4) {
			System.out.println("Aproveitamento = " + aproveitamento + "\nE\nReprovado");
		}

	}

}
