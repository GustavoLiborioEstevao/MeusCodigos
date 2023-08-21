import java.util.Scanner;

public class Exc9IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int contador = 0;
		
		System.out.println("Qual é sua primeira carta?");
		int cartaUm = input.nextInt();
		
		System.out.println("Qual é sua segunda carta?");
		int cartaDois = input.nextInt();
		
		System.out.println("Qual é sua terceira carta?");
		int cartaTres = input.nextInt();
		
		if (cartaUm >= 1 && cartaUm <= 3 || cartaDois >=1 && cartaDois <=3 || cartaTres >= 1 && cartaTres <= 3) {
			contador++;
		}
		if (cartaUm >= 1 && cartaUm <= 3 && cartaDois >=1 && cartaDois <=3 || cartaTres >= 1 && cartaTres <= 3 && cartaDois >=1 && cartaDois <=3 || cartaUm >= 1 && cartaUm <= 3 &&  cartaTres >= 1 && cartaTres <= 3) {
			contador++;
		}
		if (cartaUm >= 1 && cartaUm <= 3 && cartaDois >=1 && cartaDois <=3 && cartaTres >= 1 && cartaTres <= 3) {
			contador++;
		}
		if (contador == 1) {
			System.out.println("Truco!");
		}
		if (contador == 2) {
			System.out.println("Seis!");
		}
		if (contador == 3) {
			System.out.println("Nove!");
		}
	}

}
