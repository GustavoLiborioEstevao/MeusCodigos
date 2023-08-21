import java.util.Scanner;

public class Exc5IfElses {

	public static void main(String[] args) {
		/* Faça um algoritmo que leia um caractere.
		Caso seja digitada a letra 'M' escreva “Masculino”.
		Se for digitada a letra 'F' escreva “Feminino”.
		Se for informado 'I' escreva “Não Informado”.
		Qualquer outra letra digitada escreva “Entrada Incorreta”.*/
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o caracter do seu gênero: ");
		char genero = input.next().charAt(0);
		
		genero = Character.toUpperCase(genero);
		
		if (genero == 'M') {
			System.out.println("Masculino");
		}  
		//else if serve porque somente se o de cima for falso irá executar o debaixo
		else if (genero == 'F') {
			System.out.println("Feminino");
		}
	
		else if (genero == 'I') {
			System.out.println("Não informado");
		}
		else {
			System.out.println("Entrada incorreta");
		}
	}

}
