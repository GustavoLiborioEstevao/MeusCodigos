import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Qual � o nome do vendedor? ");
		String nome = input.next();
		
		System.out.println("Qual � seu sal�rio fixo? ");
		double salarioFixo = input.nextDouble();
		
		System.out.println("Qual � o total de vendas em dinheiro efetuadas por voc�? ");
		double totalVendas = input.nextDouble();
		
		double comissao = 0.15 * totalVendas;
		double total = comissao + salarioFixo;
		
		System.out.println("O total que o vendedor ir� receber no final do m�s �: R$" + df.format(total));
		
		
	}

}
