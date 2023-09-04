import java.util.Scanner;

/**
 * @author glestevao
 *
 */
public class ExcArray11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int vetor1[] = new int[10];
		System.out.println("Valores vetor 1:");
		System.out.print("[");
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = 1 + i;
			System.out.print(vetor1[i] + ", ");
		}
		System.out.println("]");
		
		System.out.println("Valores vetor 2:");
		System.out.print("[");
		int vetor2[] = new int[10];
		for (int i = 0; i < vetor2.length; i++) {
			vetor2[i] = 2 + i;
			System.out.print(vetor2[i] + ", ");
		}
		System.out.println("]");
		
		System.out.println("Valores vetor 3:");
		System.out.print("[");
		int vetor3[] = new int[10];
		for (int i = 0; i < vetor3.length; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
			System.out.print(vetor3[i] + ", ");
		}
		System.out.println("]");
	}

}
