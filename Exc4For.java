
public class Exc4For {

	public static void main(String[] args) {
		int somaImpar = 0;
		int somaPar = 0;
				
				
		for(int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				somaImpar = somaImpar + i;
			}
			else {
				somaPar = somaPar + i;
			}
		}System.out.println("A soma dos n�meros �mpares �: " + somaImpar + " e a soma dos n�meros pares �: " + somaPar);
	}

}
