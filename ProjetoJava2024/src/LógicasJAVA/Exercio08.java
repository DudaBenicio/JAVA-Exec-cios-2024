package LógicasJAVA;
import java.util.Scanner;
public class Exercio08 {

	public static void main(String[] args) {
		// O USUARIO ENTRA COM UM VALOR EM REAIS E RESPECTIVAS CONVESÕES
		
		Scanner dev = new Scanner (System.in);
		System.out.println("Digite um numero ente 0 e 99: ");
		int numero = dev.nextInt();
		
		System.out.println(" ");
		System.out.println("Valor digitado:" + numero );
	
		int centena = numero/100 = 100;
		System.out.println( "Centena: " + centena);
		
		int restCentena = numero - centena;
		
		int dezena = restCentena / 10 = 10;
		System.out.println("Dezena: " + dezena);
		
		int unidade = restCentena - dezena;
		System.out.println("Unidade: "  + unidade;
		
	}

}
