package LógicasJAVA;

import java.util.Scanner;

public class Exercico05 {

	public static void main(String[] args) {
		
			Scanner dev1 = new Scanner(System.in); 
			
			System.out.println("Por favor, digite sua nota: ");
			String notaA = dev1.nextLine();
			
			System.out.println("Por favor, digite sua segunda nota: ");
			String notaB = dev1.nextLine();
			
			float notaAf = Float.parseFloat(notaA);
			float notaBf = Float.parseFloat(notaB);
			
			float soma = notaAf *4 + notaBf *6;
			float divisao = soma /10;
			System.out.println("A media das suas notas é: " + divisao);
			
			
			
			
			
			
			
			
			
			
			
				

	}

}
