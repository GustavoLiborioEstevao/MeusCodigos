import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Qual é seu número? ");
		String nmrFuncionario = input.next();
		
		System.out.println("Qual é o seu número de horas trabalhadas? ");
		double nmrHoras = input.nextDouble();
		
		System.out.println("Qual é o valor que você recebe por hora? ");
		double valorPorHora = input.nextDouble();
		
		double salario = nmrHoras * valorPorHora;
		
		System.out.println("O seu número de funcionário é: " + nmrFuncionario + " e seu salário é: R$" + df.format(salario));
	}

}
