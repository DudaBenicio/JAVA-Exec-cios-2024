package LógicasJAVA;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner dev1 = new Scanner(System.in); 
		
		System.out.println("Por favor, digite sua nota: ");
	    float nota1 = dev1.nextFloat();
	    System.out.println("Por favor digite sua segunda nota: ");
	    float nota2 = dev1.nextFloat();
	    
	    float soma = nota1 + nota2;
	    float divisao = soma/2;
	    
	    System.out.println("Sua madia aritimetica é: " + divisao);
	    System.out.println("Se sua nota foi maior que 6: PARABENS");
	    
		

	}

}
