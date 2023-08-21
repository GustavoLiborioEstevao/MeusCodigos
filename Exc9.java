import java.util.Scanner;

public class Exc9 {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Qual é a distância do trajeto em Km? ");
		double distancia = inputScanner.nextDouble();
		
		double minutos = (distancia * 2); 
		System.out.println("O tempo em mnutos para o carro Y tomar essa distância do carro X é: " + minutos); 
	}
}
