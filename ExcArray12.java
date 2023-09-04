import java.util.Scanner;

public class ExcArray12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int somaPontos = 0;

		String vetorHomem[] = new String[5];

		System.out.println("Perguntas pro homem:");
		
		System.out.println("Gosta de música sertaneja?");
		vetorHomem[0] = input.next();

		System.out.println("Gosta de futebol?");
		vetorHomem[1] = input.next();

		System.out.println("Gosta de seriados?");
		vetorHomem[2] = input.next();

		System.out.println("Gosta de redes sociais?");
		vetorHomem[3] = input.next();

		System.out.println("Gosta da Oktoberfest?");
		vetorHomem[4] = input.next();

		String vetorMulher[] = new String[5];
		
		System.out.println("Perguntas pra mulher:");
		
		System.out.println("Gosta de música sertaneja?");
		vetorMulher[0] = input.next();

		System.out.println("Gosta de futebol?");
		vetorMulher[1] = input.next();

		System.out.println("Gosta de seriados?");
		vetorMulher[2] = input.next();

		System.out.println("Gosta de redes sociais?");
		vetorMulher[3] = input.next();

		System.out.println("Gosta da Oktoberfest?");
		vetorMulher[4] = input.next();

		for(int i = 0; i < 5; i++) {
		if (vetorHomem[i].equals(vetorMulher[i])) {
			somaPontos = somaPontos + 3;
		}
		if (vetorHomem[i].equals("IND") && vetorMulher[i].equals("SIM")
				|| vetorHomem[i].equals("IND") && vetorMulher[i].equals("NÃO")
				|| vetorMulher[i].equals("IND") && vetorHomem[i].equals("SIM")
				|| vetorMulher[i].equals("IND") && vetorHomem[i].equals("NÃO")) {
			somaPontos = somaPontos + 1;
		}
		if (vetorHomem[i].equals("SIM") && vetorMulher[i].equals("NÃO")
				|| vetorMulher[i].equals("SIM") && vetorHomem[i].equals("NÃO")) {
			somaPontos = somaPontos - 2;
		}
		}
		if (somaPontos == 15) {
			System.out.println("Casem!");
		}
		if (somaPontos <= 14 && somaPontos >= 10) {
			System.out.println("Vocês têm muita coisa em comum!");
		}
		if (somaPontos <= 9 && somaPontos >= 5) {
			System.out.println("Talvez não dê certo :(");
		}
		if (somaPontos <= 4 && somaPontos >= 0) {
			System.out.println("Vale um encontro.");
		}
		if (somaPontos <= -1 && somaPontos >= -9) {
			System.out.println("Melhor não perder tempo!");
		}
		if (somaPontos == -10) {
			System.out.println("Vocês se odeiam!");
		}
		
		System.out.println(somaPontos);
	
		}

}
