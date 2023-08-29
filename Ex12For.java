import java.util.Scanner;

public class Ex12For {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int somaImpar = 0;
		int somaPar = 0;
		
		for(int i = 0; i <= 1000; i++) {
			
			if (i % 2 != 0) {
				somaImpar = i + somaImpar;
			}else {
				somaPar = i + somaPar;
			}
		
		}
		System.out.println("A soma dos números ímpares é " + somaImpar + " e a soma dos números pares é " + somaPar + ".");
	}

}
