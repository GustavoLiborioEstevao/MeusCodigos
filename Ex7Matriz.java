import java.security.PublicKey;

public class Ex7Matriz {

	public static void main(String[] args) {
		char matriz1[][] = new char[4][4];
		System.out.println("Figura a:");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				matriz1[i][j] = '*';
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\n");
		System.out.println("Figura b:");
		char matriz2[][] = new char[4][4];
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				if (j == matriz2.length - 1 || i == matriz2[i].length - 1 || i == 0 || j == 0) {
					matriz2[i][j] = '*';
				}
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\n");
		System.out.println("Figura c:");
		char matriz3[][] = new char[4][4];
		for (int i = 0; i < matriz3.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				matriz3[i][j] = '*';
			}
		}
		for (int i = 0; i < matriz3.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(matriz3[i][j] + " ");
			}
			System.out.println();
		}

	}
}
