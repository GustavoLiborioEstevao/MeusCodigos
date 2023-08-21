import java.util.Scanner;

public class Excircunferencia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite qual é o valor do raio da circunferência: ");
		double raio = input.nextDouble();
		
		double area = (raio * raio) * Math.PI;
		
		System.out.println("A área da circunferência é: " + area);
	}

}
