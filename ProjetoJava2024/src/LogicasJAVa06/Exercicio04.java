package LogicasJAVa06;
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		// NUMEROS MULTIPLOS
		
		Scanner luc = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		int num1 = luc.nextInt();
		
		System.out.println("Digite um segundo numero: ");
		int num2 = luc.nextInt();
		
	 if ( num1 % num2 == 0 || num2 % num1 == 0) { 
		 System.out.println("Seus numeros são multiplos");
	 } else { 
		 System.out.println("Seus numeros não são multiplos");
	 }
		

	}

}
