package LógicasJAVA;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner dev1 = new Scanner(System.in); 
		System.out.println("Por favor, informe seu nome: " );
		String nome = dev1.nextLine();
		
	System.out.println("Digite seu genero: \n M = Masculino \n F = Feminino \n O = Outro \n N = Nenhum" );
		char genero = dev1.nextLine().charAt(0);
		
		System.out.println("Seu nome é: " + nome);
		System.out.println("Seu genero é: " + genero);
		
				

		

	}

}
 