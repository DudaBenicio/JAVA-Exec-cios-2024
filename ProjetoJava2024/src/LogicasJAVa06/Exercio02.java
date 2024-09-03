package LogicasJAVa06;
import java.util.Scanner;
public class Exercio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dev = new Scanner (System.in);
		System.out.println("Por favor, digite um numero: ");
		int numero1 = dev.nextInt();
		System.out.println("Por favor, digite um segundo numero: ");
		int numero2 = dev.nextInt();
		
		if (numero1 > numero2) { 
			System.out.println("Seu maior numero é: " + numero1);
		} else if (numero1 == numero2) {
			System.out.println("Esses numeros tem o mesmo valor. Repita.");
		} else { 
		System.out.println("O maior numero digitado é: " + numero2);
		}
		
	}

}
