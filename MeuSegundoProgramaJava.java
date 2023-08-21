import java.util.Scanner;

public class MeuSegundoProgramaJava {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva seu jogo favorito: ");
		String ola = input.next();
		
		System.out.println("O seu jogo é favorito: " + ola);
	}

}
