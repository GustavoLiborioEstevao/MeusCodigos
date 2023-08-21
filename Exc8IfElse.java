import java.util.Scanner;

public class Exc8IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Em que ano nasceu o primeiro irmão? ");
		int anoUm = input.nextInt();
		
		System.out.println("Em que ano nasceu o segundo irmão? ");
		int anoDois = input.nextInt();
		
		System.out.println("Em que ano nasceu o terceiro irmão? ");
		int anoTres = input.nextInt();
		
		if (anoUm == anoDois && anoDois == anoTres && anoDois == anoUm && anoUm == anoTres && anoTres == anoUm && anoUm == anoDois) {
				System.out.println("Eles são trigêmeos");
			}
		else if (anoUm == anoDois || anoUm == anoTres || anoDois == anoUm || anoDois == anoTres || anoTres == anoUm || anoTres == anoDois) {
			System.out.println("Eles são gêmeos");
		}
		
		else if (anoUm != anoDois && anoUm != anoTres || anoDois != anoUm && anoDois != anoTres || anoTres != anoDois && anoTres != anoUm) {
					System.out.println("Eles são apenas irmãos");
				}
	}

}
