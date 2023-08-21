import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Qual � seu n�mero? ");
		String nmrFuncionario = input.next();
		
		System.out.println("Qual � o seu n�mero de horas trabalhadas? ");
		double nmrHoras = input.nextDouble();
		
		System.out.println("Qual � o valor que voc� recebe por hora? ");
		double valorPorHora = input.nextDouble();
		
		double salario = nmrHoras * valorPorHora;
		
		System.out.println("O seu n�mero de funcion�rio �: " + nmrFuncionario + " e seu sal�rio �: R$" + df.format(salario));
	}

}
