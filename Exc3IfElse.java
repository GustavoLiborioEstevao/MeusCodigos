import java.util.Scanner;

public class Exc3IfElse {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		String str = inputScanner.next();
		
		String nome = "Gustavo";
		
		if (str.equalsIgnoreCase("Gustavo")) {
			System.out.println("O nome est� correto");
		} else {
			System.out.println("O nome est� incorreto");
		}
	}

}
