import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor da largura: ");
		int largura = input.nextInt();
		System.out.println("Insira o valor da altura: ");
		int altura = input.nextInt();
		
		int area = altura * largura;
		int perimetro = (altura * 2) + (largura * 2);
		
		System.out.println("O valor do perímetro é: " + perimetro + " e o valor da area é: " + area);
	}

}
