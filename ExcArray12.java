import java.util.Scanner;

public class ExcArray12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int somaPontos = 0;

		String vetorHomem[] = new String[5];

		System.out.println("Perguntas pro homem:");
		
		System.out.println("Gosta de m�sica sertaneja?");
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
		
		System.out.println("Gosta de m�sica sertaneja?");
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
				|| vetorHomem[i].equals("IND") && vetorMulher[i].equals("N�O")
				|| vetorMulher[i].equals("IND") && vetorHomem[i].equals("SIM")
				|| vetorMulher[i].equals("IND") && vetorHomem[i].equals("N�O")) {
			somaPontos = somaPontos + 1;
		}
		if (vetorHomem[i].equals("SIM") && vetorMulher[i].equals("N�O")
				|| vetorMulher[i].equals("SIM") && vetorHomem[i].equals("N�O")) {
			somaPontos = somaPontos - 2;
		}
		}
		if (somaPontos == 15) {
			System.out.println("Casem!");
		}
		if (somaPontos <= 14 && somaPontos >= 10) {
			System.out.println("Voc�s t�m muita coisa em comum!");
		}
		if (somaPontos <= 9 && somaPontos >= 5) {
			System.out.println("Talvez n�o d� certo :(");
		}
		if (somaPontos <= 4 && somaPontos >= 0) {
			System.out.println("Vale um encontro.");
		}
		if (somaPontos <= -1 && somaPontos >= -9) {
			System.out.println("Melhor n�o perder tempo!");
		}
		if (somaPontos == -10) {
			System.out.println("Voc�s se odeiam!");
		}
		
		System.out.println(somaPontos);
	
		}

}
