import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Qual é o nome do vendedor? ");
		String nome = input.next();
		
		System.out.println("Qual é seu salário fixo? ");
		double salarioFixo = input.nextDouble();
		
		System.out.println("Qual é o total de vendas em dinheiro efetuadas por você? ");
		double totalVendas = input.nextDouble();
		
		double comissao = 0.15 * totalVendas;
		double total = comissao + salarioFixo;
		
		System.out.println("O total que o vendedor irá receber no final do mês é: R$" + df.format(total));
		
		
	}

}
