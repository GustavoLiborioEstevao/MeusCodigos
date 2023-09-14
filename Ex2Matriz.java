
public class Ex2Matriz {

	public static void main(String[] args) {
		int matriz[][] = new int[2][2];

		matriz[0][0] = 4;
		matriz[1][0] = 2;
		matriz[0][1] = 12;
		matriz[1][1] = -3;

		int determinante = (matriz[0][0] * matriz[1][1]) - (matriz[1][0] * matriz[0][1]);

		System.out.println("O determinante da matriz é " + determinante);
	}

}
