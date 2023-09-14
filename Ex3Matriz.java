
public class Ex3Matriz {

	public static void main(String[] args) {

		int matriz[][] = new int[2][2];
		matriz[0][0] = 1;
		matriz[1][0] = 2;
		matriz[0][1] = 3;
		matriz[1][1] = 4;

		int matriz2[][] = new int[2][2];
		matriz2[0][0] = 5;
		matriz2[1][0] = 6;
		matriz2[0][1] = 7;
		matriz2[1][1] = 8;

		System.out.println((matriz[0][0] + matriz2[0][0]) + " " + (matriz[0][1] + matriz2[0][1]) + "\n"
				+ (matriz[1][0] + matriz2[1][0]) + " " + (matriz[1][1] + matriz2[1][1]));
	}

}
