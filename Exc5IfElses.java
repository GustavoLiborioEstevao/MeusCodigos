import java.util.Scanner;

public class Exc5IfElses {

	public static void main(String[] args) {
		/* Fa�a um algoritmo que leia um caractere.
		Caso seja digitada a letra 'M' escreva �Masculino�.
		Se for digitada a letra 'F' escreva �Feminino�.
		Se for informado 'I' escreva �N�o Informado�.
		Qualquer outra letra digitada escreva �Entrada Incorreta�.*/
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o caracter do seu g�nero: ");
		char genero = input.next().charAt(0);
		
		genero = Character.toUpperCase(genero);
		
		if (genero == 'M') {
			System.out.println("Masculino");
		}  
		//else if serve porque somente se o de cima for falso ir� executar o debaixo
		else if (genero == 'F') {
			System.out.println("Feminino");
		}
	
		else if (genero == 'I') {
			System.out.println("N�o informado");
		}
		else {
			System.out.println("Entrada incorreta");
		}
	}

}
