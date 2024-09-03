package LogicasJAVa06;
import java.util.Scanner;
public class Exercicios01 {

	public static void main(String[] args) {
		// VERIFICAR SE O NUMERO É ÍMPAR OU PAR //
		
		Scanner dev = new Scanner (System.in);
		System.out.println("Por favor, difite um numero: ");
		int numero = dev.nextInt();
		
		if (numero /2 == 0) { 
			System.out.println("Seu numero é par");
		} else { 
			System.out.println("Seu numero é impar");
		}
		
	
	}

}
