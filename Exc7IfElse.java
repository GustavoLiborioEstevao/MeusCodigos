import java.util.Scanner;

public class Exc7IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dê a coordenada do ponto X: ");
		int x = input.nextInt();
		
		System.out.println("Dê a coordenada do ponto Y: ");
		int y = input.nextInt();
		
			if (x >= 0 && y >= 0) {
				System.out.println("Você está no primeiro quadrante");
			}
				if (x <=0 && y <=0) {
					System.out.println("Você está no terceiro quadrante");
				}
					if (x <= 0 && y >=0) {
						System.out.println("Você está no segundo quadrante");
					}
						if (x >= 0 && y <=0) {
							System.out.println("Você está no quarto quadrante");
						}
	
	}

}
