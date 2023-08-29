
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
		}System.out.println("A soma dos números ímpares é: " + somaImpar + " e a soma dos números pares é: " + somaPar);
	}

}
