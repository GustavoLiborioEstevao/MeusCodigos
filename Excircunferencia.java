import java.util.Scanner;

public class Excircunferencia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite qual � o valor do raio da circunfer�ncia: ");
		double raio = input.nextDouble();
		
		double area = (raio * raio) * Math.PI;
		
		System.out.println("A �rea da circunfer�ncia �: " + area);
	}

}
