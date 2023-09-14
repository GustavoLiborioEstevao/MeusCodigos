import java.util.Scanner;

public class Ex5Matriz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int somaPrecoCasa = 0;
		double mediaPrecoCasa = 0;
		int menorCasa = Integer.MAX_VALUE;
		int precoMenorCasa = 0;
		int casaMaisCara = Integer.MIN_VALUE;
		int quartosCasaCara = 0;
		int casaMaisQuartos = Integer.MIN_VALUE;
		int tamanhoCasaMaisQuartos = 0;
		int casaMenosQuartos = Integer.MAX_VALUE;
		int tamanhoCasaMenosQuartos = 0;
		int diferencaTamanhoCasas = 0;
		int casasMaisDe300 = 0;
		int contadorCasa300 = 0;
		int mediaTamanhoCasa300 = 0;
		
		int matriz[][] = { { 2104, 3, 399900 }, { 1600, 3, 329900 }, { 2400, 3, 369000 }, { 1416, 2, 232000 },
				{ 3000, 4, 539900 }, { 1985, 4, 299900 }, { 1534, 3, 314900 }, { 1427, 3, 199000 }, { 1380, 3, 212000 },
				{ 1494, 3, 242500 }, { 1940, 4, 240000 }, { 2000, 3, 347000 }, { 1890, 3, 330000 }, { 4478, 5, 699900 },
				{ 1268, 3, 259900 } };

		for (int i = 0; i < matriz.length; i++) {

			somaPrecoCasa = matriz[i][2] + somaPrecoCasa;

			if (matriz[i][0] < menorCasa) {
				precoMenorCasa = matriz[i][2];

			}
			if (matriz[i][2] > casaMaisCara) {
				casaMaisCara = matriz[i][2];
				quartosCasaCara = matriz[i][1];
			}
			if (matriz[i][1] > casaMaisQuartos) {
				casaMaisQuartos = matriz[i][1];
				tamanhoCasaMaisQuartos = matriz[i][0];
			}
			if (matriz[i][1] < casaMenosQuartos) {
				casaMenosQuartos = matriz[i][1];
				tamanhoCasaMenosQuartos = matriz[i][0];
			}
			if (matriz[i][2] > 300000) {
				casasMaisDe300 = matriz[i][0] + casasMaisDe300;
				contadorCasa300 = contadorCasa300 + 1;
			}
		}

		mediaPrecoCasa = somaPrecoCasa / matriz.length;
		diferencaTamanhoCasas = tamanhoCasaMaisQuartos - tamanhoCasaMenosQuartos;
		mediaTamanhoCasa300 = casasMaisDe300 / contadorCasa300;
		
		System.out.println("A média dos preços das casas é " + mediaPrecoCasa);
		System.out.println("A menor casa custa " + precoMenorCasa + " e a casa mais cara tem " + quartosCasaCara + " quartos");
		System.out.println("A diferença de tamanho da casa com o maior número de quartos para a casa com o menor número de quartos é " + diferencaTamanhoCasas);
		System.out.println("A média do tamanho das casas que custam mais de 300.000 mil é " + mediaTamanhoCasa300);
	}

}
